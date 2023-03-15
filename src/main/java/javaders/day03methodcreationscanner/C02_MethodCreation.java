package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_MethodCreation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("First Number : ");
        int num1 = input.nextInt();

        System.out.println("Second Number : ");
        int num2 = input.nextInt();

        System.out.println("Result : " + add(num1,num2));
        System.out.println("Multiply Result : " + multiply(num1,num2));

    }

    private static int multiply(int a, int b)
    {
        return a * b;
    }


    public static int add(int a,int b) //access modifiers yazılmazsa java default algılar
    {
        return a + b;
    }
}
