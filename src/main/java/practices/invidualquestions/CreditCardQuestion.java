package practices.invidualquestions;

import java.util.Arrays;
import java.util.Scanner;

public class CreditCardQuestion
{

    //Ask username, surname and credit card numbers than convert it to special form.
    //Initials for name and surname should be uppercase.

    //Check credit card number, if there aren't 16 digits, print "Invalid credit card number."

    public static void main(String[] args)
    {
        boolean creditCardNumberSituation = false;

        Scanner scan = new Scanner(System.in);

        System.out.print("Name : ");
        StringBuilder name = new StringBuilder(scan.nextLine());

        System.out.print("Surname : ");
        StringBuilder surname = new StringBuilder(scan.nextLine());

        System.out.print("Card number which has got 16 digits : ");
        StringBuilder cardNumber = new StringBuilder(scan.nextLine());


        System.out.println("\n-----------------------------------------\n");

        String s1[] = name.toString().split(" ");
        name.delete(0,name.length());

        for (String w : s1)
        {
            name.append(w.substring(0,1).toUpperCase() + w.substring(1));
            name.append(" ");
        }

        String s2[] = surname.toString().split(" ");
        surname.delete(0,surname.length());

        for (String w : s2)
        {
            surname.append(w.substring(0,1).toUpperCase() + w.substring(1));
            surname.append(" ");
        }

        if(cardNumber.toString().contains(" "))
        {
            s1 = cardNumber.toString().split(" ");
            int sumOfCharacters = 0;

            for(String w : s1)
            {
                sumOfCharacters += w.length();
            }

            if(sumOfCharacters == 16)
                creditCardNumberSituation = true;
        }

        else
        {
            creditCardNumberSituation = cardNumber.length() == 16 ? true : false;
        }

        if(creditCardNumberSituation)
        {
            boolean flag = true;
            for(int i = 0 ; i < name.toString().length() ; i++)
            {
                if(flag)
                {
                    flag = false;
                    System.out.print(name.toString().charAt(i));
                }

                else
                {
                    if(name.toString().charAt(i) == ' ')
                    {
                        System.out.print(name.toString().charAt(i));
                        flag = true;
                    }

                    else
                    {
                        System.out.print("*");
                    }

                }
            }

            System.out.println(" ");

            flag = true;
            for(int i = 0 ; i < surname.toString().length() ; i++)
            {
                if(surname.toString().charAt(i) == ' ')
                    flag = true;

                if(flag)
                {
                    flag = false;
                    System.out.print(surname.toString().charAt(i));
                }

                else
                {
                    if(surname.toString().charAt(i) == ' ')
                    {
                        System.out.print(surname.toString().charAt(i));
                        flag = true;
                    }

                    else
                    {
                        System.out.print("*");
                    }
                }
            }

            System.out.print("\nCCN : ");
            int counter = 16;
            int intCounts = 0;
            int counters = 0;
            for (int i = 0 ; i < cardNumber.length() ; i++)
            {
                if(intCounts != 0 && intCounts %4 == 0)
                {
                    System.out.print(" ");
                    intCounts = 0;
                }

                if(cardNumber.toString().charAt(i) != ' ')
                {
                    if(counters == 12)
                    {
                        System.out.print(cardNumber.toString().charAt(i));
                        intCounts++;
                    }

                    else
                    {
                        intCounts++;
                        System.out.print("*");
                        counters++;
                    }
                }
            }
        }

        else
        {
            System.out.println("Invalid credit card number");
        }
    }
}
