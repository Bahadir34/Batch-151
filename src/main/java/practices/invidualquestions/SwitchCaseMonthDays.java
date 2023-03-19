package practices.invidualquestions;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class SwitchCaseMonthDays
{

    public static void main(String[] args)
    {


        Scanner input = new Scanner(System.in);

        System.out.print(" Input a month number : ");
        int monthNumber = input.nextInt();

        System.out.print("Input a year : ");
        int yearNumber = input.nextInt();

        LocalDate localDate = LocalDate.of(yearNumber,monthNumber,1);

        switch (monthNumber)
        {
            case 1:
                System.out.println(localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
                break;

            case 2:
               System.out.println(localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
                break;

            case 3:
                System.out.println(localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
                break;

            case 4:
                System.out.println(localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
                break;

            case 5:
                System.out.println(localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
                break;

            case 6:
                System.out.println(localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
                break;

            case 7:
                System.out.println(localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
                break;

            case 8:
                System.out.println(localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
                break;

            case 9:
                System.out.println(localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
                break;

            case 10:
                System.out.println(localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
                break;

            case 11:
                System.out.println(localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
                break;

            case 12:
                System.out.println(localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
                break;
        }


    }

}
