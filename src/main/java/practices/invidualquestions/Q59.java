package practices.invidualquestions;

import java.util.Arrays;
import java.util.List;

public class Q59
{

    /*

    Listede eleman olarak 15 varsa tüm 15 ler 51 olarak değiştiriniz.

     */

    public static void main(String[] args)
    {

        List<Integer> liste1 = new java.util.ArrayList<>(List.of(12, 11, 15, 34, 15, 43));

        for (Integer w : liste1)
        {
            if(15 == w)
            {
                liste1.set(liste1.indexOf(15),51);
            }
        }
        System.out.println(liste1);

    }

}
