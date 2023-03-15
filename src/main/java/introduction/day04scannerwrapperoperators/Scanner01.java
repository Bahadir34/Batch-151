package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01
{
    public static void main(String[] args)
    {
        //Kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki basamağındaki
        //rakamların toplamını yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.println("5 Basamaklı Sayı Giriniz : ");
        int number = input.nextInt();

        int firstDigit = number % 10;

        number /= 10;

        int secondDigit = number % 10;

        number /= 10;
        number /= 10;

        int thirdDigit = number % 10;
        number/= 10;

        int fourthDigit = number % 10;

        System.out.println("İlk iki basamak tooplamı : " + (firstDigit + secondDigit));
        System.out.println("Son iki basamak toplamı : " + (thirdDigit + fourthDigit));
    }
}
