package practices.invidualquestions;

import java.time.LocalDate;
import java.util.Scanner;

public class CalculateBirthday
{

    /*
    Calculate the number of day how many days to birthday
     */

    public static void main(String[] args)
    {
        int year = 0,month =0 , day = 0;
        
        Scanner input = new Scanner(System.in);
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        System.out.print("Enter your birth day : ");
        int dayOfBirth = input.nextInt();
        
        System.out.print("Enter your birth month : ");
        int monthOfBirth = input.nextInt();
        
        System.out.print("Enter your birth year : ");
        int yearOfBirth = input.nextInt();
        
        LocalDate birthDate = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        System.out.println("birthDate = " + birthDate);
        
        if(nowDate.getMonthValue() < birthDate.getMonthValue())
        {
            year = nowDate.getYear() - birthDate.getYear() - 1;

            if(nowDate.getDayOfMonth() < birthDate.getDayOfMonth())
            {
                month = (12-nowDate.getMonthValue()) + birthDate.getMonthValue();

                if(year > 12)
                {
                    year++;
                    month -= 12;
                }

            }

            else
            {
                month = (12-nowDate.getMonthValue()) + birthDate.getMonthValue() - 1;

                if(year > 12)
                {
                    year++;
                    month -= 12;
                }


            }
        }



        else
        {
            year = nowDate.getYear() - birthDate.getYear();

            if(nowDate.getDayOfMonth() < birthDate.getDayOfMonth())
            {

            }

            else
            {

            }

        }


        System.out.println();
        
    }

}
