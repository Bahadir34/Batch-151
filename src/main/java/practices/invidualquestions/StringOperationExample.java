package practices.invidualquestions;

import java.util.Scanner;

public class StringOperationExample
{

    /*

     Ask user for a string and print a new string made of 3 copies of the last 2 letters
    The strings length will be at least 2.
    Sample:

    INPUT       : Mustafa
    OUTPUT      : fafafa

     */

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("INPUT  : ");
        String name = input.next();

        if(name.length() < 2)
        {

        }

        else
        {
            System.out.println("OUTPUT : " + name.substring(name.length()-2) + name.substring(name.length()-2) + name.substring(name.length()-2));
        }

    }

}
