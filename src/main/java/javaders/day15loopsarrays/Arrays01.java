package javaders.day15loopsarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays01
{
    public static void main(String[] args)
    {
        /*

        1) Array, Java'nın aynı data tipinde coklu data depolamak ıcın lusturdugu bir yapıdır.
        2) Array'ler "primitive data type" leri veya "referance"lar ile çalışırlar.
         */

        //array nasil olusturulur?
        String stdNames[] = new String[5];

        //array nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames)); //==> null'lar String'in default degerlerıdır.

        //Arrey'e nasıl eleman eklenır?
        stdNames[0] = "Mehmet";
        stdNames[3] = "Cüneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames));

        //Array'deki specific bir elemanı nasıl alabılırız?
        System.out.println(stdNames[3]);
        System.out.println();
        //Example " : stdNames array'indeki her ismin sonuna yıldız koyarak console'a yazdırınız.

        for (int i = 0; i< stdNames.length;i++) //length, String'lerde () ile kullanılır. Array'lerde parantezsiz degistirilir.
        {
            stdNames[i] += "*";
            System.out.println(stdNames[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(stdNames));

        System.out.println();

        //2.way: for-each loop ==> Enhanced(Zenginleştirilmiş) Loop - Mumkunse hep for-each kullanın.

        for(String w : stdNames)
        {
            System.out.println(w + "*");
        }

        //Example 2 : Bir intger array olusturunuz. 5 eleman ekleyınız. Elemanların toplamını bulup
        //console a yazdırınız.

        int numbers[] = new int[5];
        int sum = 0;
        int a = 6;
        for (int w : numbers)
        {
            w += a;
            sum += w;
            a += 2;

        }

        System.out.println("Result : " + sum);

        System.out.println();


        //********************************************************

        //Example 3 : bir char array olusturunuz. 3 eleman ekleyınız. elemanların carpımını console'a yazdırınız.

        char numbers1[] = new char[3];
        numbers1[0] = '2';
        numbers1[1] = '3';
        numbers1[2] = '4';

        int multiple = 1;

        for (char w : numbers1)
        {
            multiple = multiple * Integer.valueOf(""+w);
        }

        System.out.println("Result : " + multiple);
    }
}
