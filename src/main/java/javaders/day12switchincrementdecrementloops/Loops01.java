package javaders.day12switchincrementdecrementloops;

public class Loops01
{

    public static void main(String[] args)
    {

        /*
        Tekrar gerektiren işleri yapmak için "Loop" yapılarını kullanırız.

        4 adet loop yapısı vardır.
            * for loop
            * while loop
            * do-while loop
            * for-each loop
         */

        // for loop
        // for (#starting value ; # loop condition ; #Increment/Decrement)
        for (int i = 1; i < 6; i++)
        {
            System.out.println("Hello World!");
        }

        //Ex : 4 den 24 e kalan olan sayıları aralarında boşluk bırakarak aynı satırda yazın

        for(int i = 4; i<25;i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        //Ex : 33 den 11 e kadar tum çift tamsayıları aynı satırda, aralarında boşuk bırakarak konsola yazın
        for (int i = 33 ; i>10 ;i--)
        {
            if(i%2 == 0)
                System.out.print(i + " ");
        }

        //NOT : Yazılan kod başka sahadan uzmanlık içermemeli.
        System.out.println();
        //Ex : 20 den 74 e kadar tüm tek tam sayıları aynı satırda aralarına boşluk bırakarak yazın.

        for(int i = 20 ; i<75 ; i++)
        {
            if(i %2 != 0)
                System.out.print(i + " ");
        }

        System.out.println();

        //Ex : Massachuttes kelimesindeki tüm sesli harfleri console a yazdırınız.
        String s = "ilik";

        for(int i = 0; i<s.length();i++)
        {
            if(s.toLowerCase().charAt(i) =='a' || s.toLowerCase().charAt(i) =='e' || s.toLowerCase().charAt(i) =='i' || s.toLowerCase().charAt(i) =='o' || s.toLowerCase().charAt(i) =='u')
            {
                System.out.print(s.charAt(i));
            }

        }
    }
}
