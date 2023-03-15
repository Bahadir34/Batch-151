package introduction.day04scannerwrapperoperators;

import org.w3c.dom.ls.LSOutput;

public class C03_MantikOperatorleri
{


    public static void main(String[] args)
    {

        /*

    == -> Eşittir
    != -> Eşit Değildir
    < -> Küçüktür
    > -> Büyüktür
    = -> atama operatörü
    && -> VE operatörü (ilk gördüğü false değerinde sonuç direk false dur)
    & -> VE operatörü (bütün satırı tarayarak sonucu değerlendirir. 1 tane false varsa sonuç false dur.)
    || -> VEYA operatörü

     */

        boolean sonuc1 = 5>4 && 7<9 && 6+3 == 9 && 5+2 !=8;
        System.out.println(sonuc1);

        boolean sonuc2 = 5>4 && 7>9 && 6+3 == 9 && 5+2 != 7;

        System.out.println(sonuc2);
    }
}
