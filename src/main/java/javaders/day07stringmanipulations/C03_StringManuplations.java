package javaders.day07stringmanipulations;

import java.util.Scanner;

public class C03_StringManuplations
{

    public static void main(String[] args) {

         /*
            Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

                i) En az 8 karakterden olussun
                ii)Password space icermesin
                iii)En az 1 tane buyuk harf olsun
                iv) En az 1 tane kucuk harf olsun
                v) En az 1 tane sembol olsun
                vi) En az 1 tanede rakam olsun
        */

        Scanner input = new Scanner(System.in);
        System.out.println("\n1) En az 8 karakterden oluşsun + " +
                "\n2) Password space içermesin + " +
                "\n3) En az 1 adet büyük harf bulunsun" +
                "\n4) En az 1 adet kucuk harf bulunsun" +
                "\n5) En az 1 adet sembol bulunsun" +
                "\n6) En az 1 adet rakam bulunsun ");
        System.out.print("Lütfen Parola Giriniz : ");
        String pwd = input.nextLine();

        //En az 8 karakterden oluşma şartı
        //boolean first = pwd.length() >= 8;
        boolean first = pwd.length() > 7; //daha hızlı çalışır. = şartına bakmaz.

        //password space içermesin
        boolean second = !pwd.contains(" "); //boşluk içermeyen demek için başına ! koyduk.

        //En az 1 adet büyük harf bulunsun.
        boolean third = pwd.replaceAll("[^A-Z]", "").length() > 0;
        /*
        büyük harfler dışında olan dataları siliyoruz. Eğer 1 tane bile data kalıyorsa
        demek ki içinde minimum 1 adet büyük harf kalmıştır demektir.
         */

        //En az 1 adet küçük harf bulunsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length() > 0;
         /*
        küçük harfler dışında olan dataları siliyoruz. Eğer 1 tane bile data kalıyorsa
        demek ki içinde minimum 1 adet küçük harf kalmıştır demektir.
         */

        //En az 1 adet sembol olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z-0-9]", "").length() > 0;

        //En az 1 adet rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]", "").length() > 0;


        boolean result = first && second && third && fourth && fifth && sixth;
        if (result)
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Fail!");
        }
    }
}
