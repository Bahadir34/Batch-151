package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02
{

    /*

    Kullanıcıdan bir sayı alınız, o sayı pozitif ise ekrana pozitif yazdırın
    değilse ekrana pozitif değil yazdırın.

     */
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Please  enter a number : ");

        int number = input.nextInt();

        String result = number > 0 ? "Pozitif" : "Pozitif Değil";

        System.out.println(result);
    }

}
