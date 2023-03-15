package javaders.day02printmethodcreation;

import java.util.Scanner;

public class PrintlnPrint
{
    public static void main(String[] args)
    {
        //System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");
        //System.out.println("JAVA\nILE\nGUZEL\nDUNYA");
        System.out.println("IT'S\tA\tGOOD\tDAY\tWITH\tJAVA");

        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz

        System.out.println("\"TECH\" PRO ILE JAVA COK \'KOLAY\'");

        //" MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir"

        System.out.println("\"MAHARET\" hiç \'DUSMEMEK\' degil\n\t\"Her dustugunde kalkabilmektir\" ");

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter girin : ");
        char ch = input.nextLine().charAt(1); // 1.index teki karakteri al, parantez içine yazılan rakam girilen metnin indexini

        System.out.println("  " + ch + "  " + "\n " + ch + " " + ch + "\n" + ch + " " + ch + " " + ch);
    }
}
