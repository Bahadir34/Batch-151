package practices.invidualquestions;

import java.util.Scanner;

public class FinfingPerfectNumberReplit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("INPUT :");
        int num = input.nextInt();
        int toplam = 0;

        for(int i = 1 ; i < num ; i++)
        {
            if(num % i == 0)
                toplam += i;
        }

        if(toplam == num)
            System.out.println(num + " is Perfect Number");
        else
            System.out.println(num + " is not Perfect Number");
    }
}
