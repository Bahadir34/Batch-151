package practices.questionbankapexquestions;

import java.util.ArrayList;

public class Lists_008
{

    /*
    Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
    Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
    */
    //Bahadır Ahmet
    
    public static void main(String[] args)
    {

        ArrayList<Integer> nums = new ArrayList<>();
        
        nums.add(12);
        nums.add(31);
        nums.add(7);
        nums.add(13);
        nums.add(10);
        nums.add(55);

        System.out.println("nums = " + nums);
        for(Integer w : nums)
        {
            if(w == 7 || w == 10)
                continue;
            else
            {
                nums.set(nums.indexOf(w), w+2);
            }
        }
        System.out.println("nums = " + nums);

    }

}
