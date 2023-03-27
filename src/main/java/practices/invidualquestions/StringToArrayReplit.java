package practices.invidualquestions;

import java.util.Arrays;
import java.util.Scanner;

public class StringToArrayReplit
{


    /*
    Create a custom return type method accepts a name as parameter and prints the name as a char array.

    (do not use toCharArray() method)


    Input : John

    Output :[J, o, h, n]
     */

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Text : ");
        String s1 = input.nextLine();

        stringToArray(s1);

    }

    public static void stringToArray(String text)
    {
        char ch[] = new char[text.length()];

        for(int i = 0 ; i < text.length() ; i++)
        {
            ch[i] = text.charAt(i);
        }
        System.out.println(Arrays.toString(ch));
    }
}
