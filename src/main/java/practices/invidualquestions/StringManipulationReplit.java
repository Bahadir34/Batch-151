package practices.invidualquestions;

import java.util.Arrays;
import java.util.Scanner;

public class StringManipulationReplit
{

    /*

Write a code that returns the duplicate chars in a String array.(interview Question)

Input :

String str=“Javaisalsoeasy”

Output: [a, s]
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s1 = input.nextLine();
        char ch[] = new char[s1.length()];


        for(int i = 0; i<s1.length() ; i++)
        {
            ch[i] = s1.charAt(i);
        }

        Arrays.sort(ch);
        System.out.println("Arrays.toString(ch) = " + Arrays.toString(ch));
        char helperChar = ' ';

        int counter = 0;
        for(int i = 0; i<s1.length()-1;i++)
        {
            if(ch[i] != helperChar)
            {
                if(ch[i] == ch[i+1])
                {
                    counter++;
                    helperChar = ch[i];
                }
            }
        }
        System.out.println("Tekrarlı eleman sayısı : " + counter);

        char tekrarliKarakterler[] = new char[counter];

        int j = 0;
        helperChar = ' ';
        for(int i = 0; i<s1.length()-1;i++)
        {
            if(ch[i] != helperChar)
            {
                if(ch[i] == ch[i+1])
                {
                    tekrarliKarakterler[j] = ch[i];
                    helperChar = ch[i];
                    j++;
                }
            }
        }

        System.out.println("Tekrarlı Karakterler Listesi : " + Arrays.toString(tekrarliKarakterler));

    }
}
