package javaders.day04memorykullanimiwrapperclass;

import javax.lang.model.element.NestingKind;

public class C02_WrapperClass
{
    /*

    Java bir üründür. Oracle firmasının bir ürünüdür.
    Developerlar sağdece data barındıran primitive
    data type larının non primitive ler gibi method
    da barındırmasını istemişlerdir. Bunun üzerine JAVA
    primitive data typlarına method ekleyerek özel bir
    class oluşlturmuştur. buna da wrapper(sarmalamak, durum)
    class denir.

     */

    public static void main(String[] args)
    {
        byte number = 12;
        Byte wrapperNumber = number;

        method();
        /*

        int data type ının maximum değeri ile byte data type ının
        minimum değerlerinin toplamını hesaplatan methodu oluşturun.
        AŞAĞIDA YAZILI

         */

        //büyük kutu içerisine küçük kutuyu yerleştirdik.
        //Bu işleme autoboxing denir.
        float primitiveFloat = 12.33F;
        Float wrapperFloat = primitiveFloat;


        //küçük kutuyu büyük kutudan çıkarma işlemidir.
        //Unboxing olarak adlandırılır.
        Character wrapperChar = 'M';
        char primitiveChar = wrapperChar;

        //Ex : Verilen iki String datanın toplamını veren kodu yazınız.

        String str1 = "12345";
        String str2 = "987";

        int str1Integer = Integer.valueOf(str1); //string olan datayı integer a döüştürür.
        int str2Integer = Integer .valueOf(str2);

        System.out.println("str1Integer + str2Integer = Result\n" + str1Integer + " + " + str2Integer + " = " + (str1Integer + str2Integer));


        /*

        Javada "+" sembolü iki int için matematikteki gibi toplama işlemi
        yapar. İki string data arasında ya da bir String bir int arasında ise
        yanyana yazdırır.
        Bu da concatination denir.
        İşlem önceliği şu şekildedir.
            * Uslu Sayılar
            *Parantez içi
            *Çarpma/bölme
            *toplama/çıkarma

         */

        String harf = "A";
        int sayi = 7;

        //eğer üslü ifade varsa, parantez varsa, veya çarpma bölme varsa
        //java önce bu işlemleri yapar.
        System.out.println("K"+3*(double)5/2);

    }

    public static void method()
    {
        System.out.println("Result : " + (Integer.MAX_VALUE + Byte.MIN_VALUE));
    }
}
