package javaders.day14loops;

import java.util.Scanner;

public class Loops03
{

    public static void main(String[] args)
    {
        int i = 1;

        while(i<1) // while loop da loop body sinin hiç çalışmaması mumkundur. (zero execution is possible)
        {
            System.out.println("While Loop");
            i++;
        }

        int k = 1;

        do { // do-while loop da loop bodysi en az 1 kere çalışır.
            System.out.println("do-while loop");
        }while(k<1);

        //*******************************************************************

        //kullanıcı bır sayı gırsın, sayı 100 den kucuk ise kullanıcı "Kazandınız" mesajı
        //alsın diger durumlarda "kaybettiniz" mesajı olsun

        Scanner input = new Scanner(System.in);




        do {

            System.out.print("Please enter an integer : ");
            int n = input.nextInt();

            if(n <100)
            {
                System.out.println("Won!");
            }
            else
            {
                System.out.println("Lost!");
                break;
            }
        }while(true);

        System.out.println();
        //*******************************************************************
        //Kullanıcıdan alinan bir cumlenın harfle baslayıp nokta ıle bıttıgını kontrol eden kodu yazınız

        do {

            System.out.print("Please enter a word : ");
            String s = input.next();


            if(s.endsWith(".") && s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
            {
                System.out.print("Your sentence correct grammatically!\n");
            }
            else
            {
                System.out.print("Your sentence has grammatical mistake!\n");
                break;
            }

        }while (true);

    }
}
