package practices.questionbankapexquestions;

import java.util.Scanner;

public class ForLoopQuestion001
{
    // 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number greater then 1 : ");
        int number = input.nextInt();

        for(int i = 1; i<number;i++)
        {
            if(i %3 == 0)
                System.out.print(i + " ");
        }

        // verilen iki harf ve aralarindaki harfleri yazdiran
        // bir kod yaziniz

        System.out.print("First Letter : ");
        char ch1 = input.next().charAt(0);

        System.out.print("Second Letter : ");
        char ch2 = input.next().charAt(0);

        if(ch1 > ch2)
        {
            for (int a = ch2; a < ch1; a++) {
                System.out.print((char)a + " ");
            }
        }

        else
        {
            for (int a = ch1; a < ch2; a++)
            {
                System.out.print((char)a + " ");
            }
        }
    }
}
