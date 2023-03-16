package practices.questionbankapexquestions;

import java.util.ArrayList;

public class Lists_006
{

    /*
    Listede 15 veya 13 varsa, bu elemanları kaldırınız.
    Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
    */

    public static void main(String[] args)
    {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(31);
        nums.add(15);
        nums.add(13);
        nums.add(54);

        System.out.println("nums = " + nums);

        for (int i = 0; i < nums.size(); i++)
        {
            if(nums.get(i) == 15 || nums.get(i) == 13)
            {
                System.out.println("abc");
                nums.remove(nums.get(i));
                i--;
            }
        }

        System.out.println("nums = " + nums);

    }

}
