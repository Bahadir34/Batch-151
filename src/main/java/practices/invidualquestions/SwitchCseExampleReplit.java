package practices.invidualquestions;

import java.util.Scanner;

public class SwitchCseExampleReplit
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Command : ");
        char ch1 = input.next().charAt(0);

        switch (ch1)
        {
            case 'a' :
                System.out.println("Your request is being processed");
                break;

            case 'b' :
                System.out.println("Thank you anyway for your consideration");
                break;

            case 'c' :
                System.out.println("Sorry, no help is currently available");

            default :
                System.out.println("Invalid entry, please try again!");

        }

    }

}
