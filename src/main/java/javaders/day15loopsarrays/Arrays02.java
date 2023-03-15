package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays02
{

    /*

    1) Application'larda "data" ile bu data'lari isteyen kod'lar(Logic) biriminden ayrılır.
       Yani; logic data'ya bagımlı olmamalıdır.
       Data'ya bagımlı olarak yazılan kod'lara "hard code" denir.
       "hard code" hatalı kod demektir.

     */

    public static void main(String[] args)
    {
        //Array'leri kısa yldan nasıl olustururuz?
        int grades[] = {67,98,100,34,76,55};

        System.out.println(Arrays.toString(grades));

        //Example 1 : grades array'indeki en kucuk ve en buyk grade'in toplamini ekrana yazdirian kodu yaziniz

        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));
        System.out.println("Result : " + (grades[0] + grades[grades.length-1]));

        //Example 2 : Sizde verilen bir String array deki isimlerden 5 karakterden az karakter içerenleri console'a yazdırınız.

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for(String w : stdNames)
        {
            if(w.length() < 5)
                System.out.println(w);
        }

        System.out.println();

        //*********************************************

        //Example 3 : Size verilen bir String arrayindeki isimleri alfabetik sıraya koyduktan sonra "F" ile başlayan isimlerden önceki isimleri console'a yazdırınız.

        Arrays.sort(stdNames);

        for(String w : stdNames)
        {
            System.out.println(w);

            if(w.startsWith("F"))
            {
                break;
            }
        }
        System.out.println();

        //****************************************************

        //Example 5 : //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan
        //              isimler haric diger isimleri console'a yazdiriniz

        Arrays.sort(stdNames); //sort metodu numeric data'ları kucukten buyuge(ascending) dızer.
                               //String'leri ise alfabetik(alphabetically) sırada dizer.
                               // ascending + alphabetically ==> Natural Order.
        for(String a : stdNames)
        {
            if(a.startsWith("F"))
                continue;
            else
                System.out.println(a);
        }
    }
}
