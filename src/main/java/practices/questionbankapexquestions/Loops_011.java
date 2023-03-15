package practices.questionbankapexquestions;

import java.util.Scanner;

public class Loops_011
{

    /*
    Kullanıcıdan alınan bir cumleyi tersten yazdıran bir method create ediniz.
     */

    public static void main(String[] args)
    {


        Scanner input = new Scanner(System.in);
        System.out.print("Bir cümle giriniz : ");
        String s1 = input.nextLine();

        System.out.println("s1 = " + s1);

        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        System.out.println("sb = " + sb);

    }

}
