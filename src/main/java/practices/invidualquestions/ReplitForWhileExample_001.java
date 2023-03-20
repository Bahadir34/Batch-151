package practices.invidualquestions;

import java.util.Scanner;


/*

Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

e.g:

char ch1= 'a' ;

String name = “John came late"

Expected Output: Number of a = 2

 */

public class ReplitForWhileExample_001
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        char ch = input.next().toLowerCase().charAt(0);

        int counter = 0;
        for (int i = 0; i < name.length() ; i++)
        {
            if(name.toLowerCase().charAt(i) == ch)
                counter++;
        }

        System.out.println("number of " + ch + " = " + counter );
    }
}
