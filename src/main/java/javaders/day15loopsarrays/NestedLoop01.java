package javaders.day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01
{

    public static void main(String[] args)
    {

        /*
        1. Example : Type code to get the output like

        Week : 1
            Day: 1
            Day: 2
            Day: 3
            ........

        Week : 2
            Day: 1
            Day: 2
            Day: 3
            ...........

        Week : 3
            Day: 1
            Day: 2
            Day: 3
            ..........
         */

        //nested for loop
        for(int i = 1 ; i < 5 ; i++)
        {
            System.out.println("Week : " + i);

            for (int k = 1 ; k<4; k++)
            {
                System.out.println("   Day : " + k);
            }
            System.out.println();
        }

        System.out.println();

        //nested while loop
        int x = 1;

        while(x < 5)
        {
            System.out.println("Week : " + x);
            int y = 1;
            while(y < 4)
            {
                System.out.println("   Day : " + y);
                y++;
            }
            x++;
        }

        System.out.println();
        //************************************************************
        /*
        2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
        Note: Get the number of the rows and the columns from user
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of rows : ");
        int rows = input.nextInt();

        System.out.print("Please enter number of columns : ");
        int columns = input.nextInt();

        System.out.println();
        for(int r = 1; r < rows+1 ; r++)
        {
            for (int l = 1 ; l < columns + 1 ; l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //3.Example :
        System.out.print("Please enter row number : ");
        int row = input.nextInt();

        for(int i = 1; i<=row;i++)
        {
            for (int j = 1; j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
