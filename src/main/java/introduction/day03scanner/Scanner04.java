package introduction.day03scanner;

import java.util.Scanner;

public class Scanner04
{
    //Kullanıcıdan iki sayı alıp 4 işlem yapan ve işlemlerin sonuçlarını ekrana yazdıran kodu yazınız.


    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("First Number : ");
        double firstNumber = input.nextDouble();

        System.out.print("Second Number : ");
        double secondNumber = input.nextDouble();

        System.out.println("\n\nResult of Sum : " + (firstNumber + secondNumber));
        System.out.println("Result of Minus : " + (firstNumber - secondNumber));
        System.out.println("Result of Devide : " + (firstNumber / secondNumber));
        System.out.println("Result of Multiple : " + (firstNumber * secondNumber));






    }
}
