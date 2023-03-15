package javaders.day14loops;

import java.util.Scanner;

public class Loops01
{


    public static void main(String[] args)
    {

        //verilen bir tam sayıda tekrarsız olan rakamların toplamını hesaplayıp ekrana yazdırınız.
        //1838 -> 1 + 3 = 4

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer : ");
        String s = input.next();

        int sum = 0;

        for (int i = 0 ; i<s.length() ; i++)
        {
            String d = s.substring(i,i+1);
            if(s.indexOf(d) == s.lastIndexOf(d))
            {
                sum += Integer.valueOf(d);
            }
        }

        System.out.println("Result : " + sum);
        System.out.println();
        //****************************************************************************

        //Bir String'deki tekrarlı character'leri ekrana yazdıran kodu yazınız.
        //alabala ==> la

        String t = "Alala";
        String result = "";
        for (int i = 0; i < t.length() ; i++)
        {
            if(t.indexOf(t.charAt(i)) != t.lastIndexOf(t.charAt(i)) && !result.contains("" + t.charAt(i)))
            {
                result += t.charAt(i);
            }
        }

        System.out.print("Result : " + result);
        System.out.println();
        //*******************************************************************************************

        //3'den 8'e kadar olan tüm tamsayıları console'a yazdıran kodu yazınız.

        //1.way
        for(int i = 3; i < 9; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        //2.way
        int i = 3;
        while(i < 9)
        {
            System.out.print(i + " ");
            i++;
        }


    }

}
