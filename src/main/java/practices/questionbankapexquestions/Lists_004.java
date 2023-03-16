package practices.questionbankapexquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists_004 {
    /*
    Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz. Örnek:  (Yellow, Blue, Red,
    Green) ==> Çıktı: Azalan sırada değil
    (Yellow, Green, Blue, Red) ==> Çıktı: Azalan sıradadır
     */
    public static void main(String[] args) {

        List<String> s1 = new ArrayList<>();

        s1.add("Green");
        s1.add("Red");
        s1.add("Yellow");
        s1.add("Blue");

        String araVariable = "";

        int a = 0;

        for (int i = 0; i < s1.size() - 1; i++)
        {
            for (int j = i + 1; j < s1.size(); j++)
            {
                if (s1.get(i).charAt(0) < s1.get(j).charAt(0))
                {
                    a = 1;
                    araVariable = s1.get(i);
                    s1.set(i, s1.get(j));
                    s1.set(j, araVariable);
                }
            }
        }

        if (a == 1)
        {
            System.out.println("Sıralı değildir.");
        }

        else
        {
            System.out.println("Sıralıdır.");
        }

        System.out.println(s1);


        /*
        int j = 0;
        for (int i = 0; i < s1.size() -1 ; i++)
        {
            if(s1.get(i).length() < s1.get(i+1).length())
            {
                System.out.println("Azalan sırada değil");
                j = 1;
                break;
            }
        }

        if(j == 0)
        {
            System.out.println("Azalan sıradadır");
        }
        */


    }//main
}//class
