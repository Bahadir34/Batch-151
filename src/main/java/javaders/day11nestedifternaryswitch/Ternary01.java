package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01
{

    /*

    Kullanıcıdan alınan 2 sayıdan küçük olanını ekrana yazdırın.

     */

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter two integers : ");

        int first = input.nextInt();
        int second = input.nextInt();

        //1.yol
        if(first > second)
        {
            System.out.println(first);
        }
        else
        {
            System.out.println(second);
        }

        //2.yol : Use Ternary
         int result = first < second ? first : second;

    }

}
