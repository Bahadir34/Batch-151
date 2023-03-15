package practices.invidualquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01
{
    /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz, verileri arraye atınız.
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        for(int i = 0; i<5; i++)
        {
            System.out.print(i+1 + ". sayıyı giriniz : ");
            numbers[i] = input.nextInt();
        }


        for (int w : numbers)
        {
            if(!(w > 5 && w < 10))
                sum += w;
        }
        System.out.println("Result : " + sum);


    }
}
