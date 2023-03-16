package practices.questionbankapexquestions;

import java.util.ArrayList;
import java.util.Collections;

public class Lists_007
{

        /*

        Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

        12 , 13 , 15 , 31 , 54
        */

    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(31);
        nums.add(15);
        nums.add(13);
        nums.add(54);

        int diff =nums.get(1) - nums.get(0);

        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

        for(int i = 0; i < nums.size()-1 ; i++)
        {
            diff = Math.min(diff,nums.get(i+1) - nums.get(i));
        }

        for(int i = 0; i < nums.size()-1 ; i++)
        {
            if(diff == nums.get(i+1) - nums.get(i))
            {
                System.out.println(nums.get(i) + " " + nums.get(i+1));
            }
        }
    }
}
