package introduction.day03scanner;


import java.util.Scanner;

public class Scanner03
{
    //kullanıcıdan adresini alınız ve ekrana yazdırınız.



    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen adresinizi giriniz : ");

        //next() methodu kullanıcıdan tek ekimeli stringi almak için kullanılır.

        //nextLine() methodu ise kullanıcıdan çok kelimeli stringi almak için kullanılır.
        String address = input.nextLine();

    }


}
