package practices.invidualquestions;

import java.util.Scanner;

public class BMIIndexCalculater
{
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your weight in kgs : ");
            double weight = input.nextDouble();

            System.out.print("Enter your height in meters : ");
            double height = input.nextDouble();

            double bMIIndex = weight / (height * height);

            System.out.println("Your BMI index : " + bMIIndex);

            if(bMIIndex < 18.5)
            {
                System.out.println("You're weak!");
            }
            else if(bMIIndex > 18.5 && bMIIndex < 25)
            {
                System.out.println("Your weight is ideal!");
            }
            else if(bMIIndex > 25 && bMIIndex < 30)
            {
                System.out.print("You're fat!");
            }
            else if(bMIIndex >= 30)
            {
                System.out.print("Obese!");
            }
            else
            {
                System.out.print("You entered invalid parameters!");
            }
        }
    }

