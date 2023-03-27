package practices.invidualquestions;

import java.util.Scanner;

public class NumberOfDigitsReplit
{

    /*
    Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

    input : ade1r4d3

    output : 8

         Hint :
         Use Character.isDigit()
         Integer.valueOf()
     */

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string : ");
        String s1 = input.nextLine();
        
        numOfDigits(s1);

    }
    
    public static void numOfDigits(String text)
    {
        int toplam = 0;
        
        for(int i = 0 ; i < text.length() ; i++)
        {
            if(Character.isDigit(text.charAt(i)))
                toplam += Integer.valueOf(text.substring(i,i+1));

        }
        System.out.println("result = " + toplam);
    }
}
