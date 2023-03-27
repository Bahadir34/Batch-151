package practices.invidualquestions;

import java.util.Scanner;

public class ReverseAStringReplit
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a text : ");
        String text = input.nextLine();

        reverseText(text);

    }

    public static void reverseText(String s1)
    {
        char s1Char[] = new char[s1.length()];

        for (int i = 0 ; i < s1.length() ; i++ )
        {
            s1Char[i] = s1.charAt(s1.length()-i-1);
        }

        System.out.println(s1Char);
    }
}
