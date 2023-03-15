package practices.invidualquestions;

import java.util.ArrayList;
import java.util.List;

public class Q58
{

    /*

    Bir listedeki ögelerin azalan sırada olup olmadıgını kontrol ediniz.

     */

    public static void main(String[] args)
    {

        List<String> colours = List.of("Yellow"  , "Green" , "Blue" , "Red");
        int i = 0;
        int uzunluk = Integer.MAX_VALUE;

        for (String u : colours)
        {
            if(u.length() < uzunluk)
            {
                uzunluk = u.length();
            }
            else
            {
                i = 1;
                break;
            }
        }

        if(i == 0)
        {
            System.out.println("Sirali Dizi.");
        }
        else
        {
            System.out.println("Sirali Dizi Değil.");
        }

    }

}
