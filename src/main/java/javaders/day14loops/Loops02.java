package javaders.day14loops;

import java.util.Scanner;

public class Loops02
{

    public static void main(String[] args)
    {
        //21 den 180'e kadar hem 4'e hem de 6'ya bölünebilen tam sayıları console'a
        //yazdıran kodu yazınız.

        int i = 21;

        while(i<181)
        {
            if(i % 4 == 0 && i % 6 == 0)
            {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();
        //**************************************************************

        String s = "miami";
        int m = 0;

        while(m<s.length())
        {
            String ch = s.substring(m,m+1);

            if(m % 2 == 0)
            {
                System.out.print(ch.toUpperCase());
            }
            else
            {
                System.out.print(ch);
            }
            m++;
        }

        System.out.println();

        //**************************************************************

        //Size verilen tamsayinin rakamları toplamını console'a yazdıran kodu yazınız.

        int r = -4578;
        r = Math.abs(r);

        int sum = 0;

        while(r > 0)
        {
            sum += r%10;

            r /= 10;
        }
        System.out.println("Result : " + sum);
        System.out.println();
        //**********************************************************************

        //Kullanıcıdan aldıgınız sayı ıcın carpım tablosu olusturan kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        double number = input.nextDouble();

        int u = 1;

        while(u < 11)
        {
            System.out.println(number + " x " + u + " = " + (number*u));
            u++;
        }

        System.out.println();

        //**************************************************************************

        //Kullanıcıdan aldığınız strıng dekı sessız harflerı yazdıran kodu yazınız.

        //Alabama ==> lbm


        System.out.print("Please enter a word : ");
        String x = input.next();

        int z = 0;

        while(z < x.length())
        {
            char ch = x.charAt(z);
            boolean y = ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
            {

                if (y) {
                    z++;
                    continue; //continue'yi gordugu zaman while satırına gıder.
                } else {
                    System.out.println(ch + "");
                }

                z++;
            }
        }
    }
}
