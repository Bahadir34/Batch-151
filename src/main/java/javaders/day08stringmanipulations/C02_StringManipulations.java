package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations
{

    public static void main(String[] args)
    {
         /*
        Kullanicidan email adresini girmesini isteyin,
        Asagidaki kurallara gore kullanicinin
        girdigi email adresini kontrol ediniz.

            i)mail adresi "gmail" icermeli
            ii)Space characteri mail'de olmamali
            iii)mail adresinde buyuk harf olmamali
            iv)En az bir tane noktalama isareti bulunmali
        */

        Scanner input = new Scanner(System.in);

        System.out.print("e-mail : ");
        String mail = input.nextLine();

        //1) e-mail adresi "gmail" içermeli
        boolean first = mail.contains("gmail");
        System.out.println("gmail içermeli : " + first);

        //2) space karakteri mail de olmamalı
        boolean second = !mail.contains(" ");
        System.out.println("space içermemeli : " + second);


        //3) mail adresinde büyük harf olmamalı
        boolean third = mail.replaceAll("[^A-Z]","").replaceAll(" " , "").length() == 0;
        System.out.println("Büyük harf olmamalı : " + third);


        //4) en az 1 adet noktalama işareti bulunmalı
        boolean fourth = mail.replaceAll("[^\\p{Punct}]" , "").length() > 0;
        //"[\\P{P}]" -> semboller hariç herşey demek.
        System.out.println("1 adet noktalama işareti bulunmalı : " + fourth);


        System.out.println("Result : " + (first && second && third && fourth));

    }
}
