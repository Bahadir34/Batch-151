package practices.questionbankapexquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Q012
{

    /*

    Kullanıcıdan aldıgınız tamsayılar ile bir array olusturunuz ve bu arraydeki en küçük ve en
    büyük ögeler arasındaki farkı konsolda yazdırınız.

     */
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Kac Sayı Girecen : ");
        int sayilar[] = new int[input.nextInt()];
        int counter = 0;

        for (int u : sayilar)
        {
            System.out.println(counter + 1 + ". sayı : ");
            sayilar[counter] = input.nextInt();
            counter++;
        }

        System.out.println(Arrays.toString(sayilar));
        int min = 0,max = 0;

        Arrays.sort(sayilar);
        min = sayilar[0];
        max = sayilar[sayilar.length-1];

        System.out.println("Fark : " + (max - min));


    }
}
