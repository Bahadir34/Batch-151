package javaders.day05typecastingasciivaluesstringmanipulations;

public class C03_TypeCasting
{
    public static void main(String[] args)
    {
        /*
       Numeric Data Type'larının birbirine donusturulmesine Type Casting denir
       Numeric Data Type'ları byte<short<int<long<float<double

       Küçük Data Type'larının büyük Data Typelarına dönüştürülmesine Auto Widening
       (Otomatik Gneişletme) denir ==> Küçük kutunun büyük kutu içerisine yerleştirilmesi

       büyük kutunun küçük kutuya dönüştürülmesinde Java sorumluluğu kabul etmez.
       Data kaybı olabileceği için code'u yazanlara bırakır. Buna "Explicit Narrowing" (Açıktan Daraltma" denir.

       */

        byte age = 13;
        int ageInt = age;//Autowidening otomatik genişletme

        //long data type'ını short data type ına çevirin

        long population = 3456;
        short populationShort= (short) population;//Explicit Narrowing (Açıktan Daraltma)

        //int data type'ının float data type'ına cevirin

        int boy = 170;
        float boyFloat = boy;


    }//main

}//class