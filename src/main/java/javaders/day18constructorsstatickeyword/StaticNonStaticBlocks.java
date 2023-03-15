package javaders.day18constructorsstatickeyword;

/*

    1) "static block"lar "static variable"lara ilk degerlerini atamak icin kullanılır.
    2) "static" bir variable'a deger atamak için kod yazmanız gerekırse "static block" kullanınız.
    3) "static" bir variable'a deger atamak için yazılması gereken kod main method ıcıne de yazılabılır.
       ama "static block" içine yazılan kod "main method" ıcıne yazılan kod'dan once calıstırılır.
    4) Bir class'da birden fazla static block varsa usttekı once calıstırılır.

 */

import java.time.LocalDate;
import java.util.Locale;

public class StaticNonStaticBlocks
{

    //static variable'lar "static block" kullanılmadan da "initialize" edilebilirler.
    //Asagıdakı gıbı "static" bir variable'a deger atamak ıcın kod yazmanız gerekırse "static block" kullanınız.
    public static double pi = 3.14;

    public static double price;

    static
    {
        LocalDate d = LocalDate.now();

        if(d.getMonthValue() == 3)
        {
            price = 1000;
        }
        else
        {
            price = 1200;
        }
    }

}
