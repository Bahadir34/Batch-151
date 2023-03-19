package practices.invidualquestions;

import java.util.Scanner;

public class TernaryDuplicateOrUniqueStringCheck
{

    public static void main(String[] args)
    {
        String str = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name : ");
        StringBuilder str1 = new StringBuilder(input.next());

        if(str1.length() != 3 )
        {

        }

        else
        {

            str = str1.indexOf(str1.substring(0,1)) == str1.lastIndexOf(str1.substring(0,1)) ? "String has unique characters" : "String has duplicate characters"  ;
        }

        System.out.println(str);
    }

}
