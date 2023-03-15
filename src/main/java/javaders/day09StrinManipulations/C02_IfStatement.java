package javaders.day09StrinManipulations;

public class C02_IfStatement
{
    public static void main(String[] args)
    {

        //Interview question in USA

        //Bir stringdeki tekrarsız karakterleri ekrana yazdırınız.

        // String y = "abbccdc" kullanılan container budur.
        // Sonuc uzamasın diye string değiştirildi.

        String y = "aac"; //soruya göre cevabın 'c' karakteri olması gerek.

        int sayi = -8;

        if(sayi > 0)
            System.out.println("Sayi Pozitif.");
        else
            System.out.println("Sayi Negatif");


        // Ex : Sayi 3 basamakli ise verilen data 3 basamaklidir yazdıran kodu yazınız.

        int sayi1 = 1254;

        if((sayi1 > 99 && sayi1 <1000) || (sayi1 < -99 && sayi1 > -1000))
            System.out.println("Sayi 3 basamakli.");

    }

}
