package practices.techproquestions;

import java.util.Scanner;

public class Q11_IfElse
{

    // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
    // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın


    public static void main(String[] args)
    {

        /*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    */


        Scanner input = new Scanner(System.in);

        System.out.print("Hizmet yılınızı giriniz : ");
        int hizmetYili = input.nextInt();

        System.out.print("Maaşınızı Giriniz : ");
        int maas = input.nextInt();

        if(hizmetYili >= 5)
        {
            System.out.println("%10 zamnlı maaşınız : " + (maas+0.1*maas));
        }

        else
        {
            System.out.println((5-hizmetYili)+" yıl kadar daha çalışmalısınız.");
        }
    }

}
