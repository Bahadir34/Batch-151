package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03
{
    /*
    Specific bir elemanın array de olup olmadıgını anlamak ıcın gereken kodu yazınız
     */

    public static void main(String[] args)
    {

        String[] names = {"K" , "C" , "R" ,"A" , "S"};
        String el = "E";


        //1.way :
        int counter = 0;

        for(String w : names)
        {


            if(w.equals(el))
            {
                counter++;
                break;
            }
        }

        if(counter > 0)
        {
            System.out.print("Array has the element.");
        }
        else
        {
            System.out.print("Array doens't have the element");
        }

        //2.way : binarySearch() method hızlı arama yapar.
        Arrays.sort(names);

        /*
        1) binarySearch() methodunu sort methodunu kullanmadan kullanmayınız.
        2) binarySearch() methodu var olan elemanlar için size o elemanın indexini verir.
        3) binarySearch() methodundan alınan index 0 veya 0'dan buyukse bu o eleman arrayde var demektir.
        4) binarySearch() methodu olmayan elemanlar için negatif tamsayı degerı dondurur.
           "-" işaretinin anlamı o eleman yok demektir. Sayı ise o eleaman olsaydı kaçıncı eleman olurdu demektır.

         */

        int result = Arrays.binarySearch(names,"A");
        System.out.println("\nresult = " + result);

        if(result < 0)
            System.out.print("Array doesn't have " + el);
        else
            System.out.print("Array has got " + el);

    }
}
