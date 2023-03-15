package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {


    public static void main(String[] args)
    {

        // Kullanıcından bir dikdörtgenin iki kenar uzunluğunu alın.
        /*
            i. Alanını hesaplayınız.
            ii. Çevresini hesaplayınız.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Uzun Kenar (cm): ");
        double uzunKenar = input.nextDouble();

        System.out.print("Kısa Kenar (cm): ");
        double kisaKenar = input.nextDouble();

        System.out.println("Çevre Hesabı Sonucu : " + cevreHesabi(uzunKenar,kisaKenar));
        System.out.println("Alan Hesabı Sonucu : " + alanHesabi(uzunKenar,kisaKenar));

    }

    public static double cevreHesabi(double a, double b)
    {
        return (2 * a) + (2 * b);
    }

    public static double alanHesabi(double x, double y) { return x * y; }


}
