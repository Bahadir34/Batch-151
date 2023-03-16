package practices.questionbankapexquestions;

import java.util.ArrayList;

public class Lists_005
{

    /*
        Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
    */
    public static void main(String[] args)
    {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(15);
        nums.add(12);
        nums.add(11);
        nums.add(15);
        nums.add(34);
        nums.add(43);
        nums.add(15);
        nums.add(15);

        if(nums.contains(15))
        {

            System.out.println("abc");
            for (Integer w : nums)
            {
                if(w == 15)
                {
                    nums.set(nums.indexOf(15) , 51);
                }
            }
        }

        System.out.println(nums);

    }

}
