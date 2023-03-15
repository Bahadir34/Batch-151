package javaders.day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch02
{

    /*
    Kullanıcıdan alınan karakterin sesli harf olup olmadığını kontrol ediniz.
     sesli harfler : a-e-i-o-u

     */


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a letter : ");
        char ch1 = input.next().toLowerCase().charAt(0);

        //1.way
        switch (ch1)
        {
            case 'a':
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println("It is a vowel letter.");
                break;
            default:
                System.out.println("Not nowel!");
        }


        //2.way
        System.out.print("Enter a letter : ");
        String letter2 = input.next().substring(0,1).toLowerCase();

        switch (letter2)
        {
            case "a" :
            case "e" :
            case "i" :
            case "o" :
            case "u" :
                System.out.println("It is a vowel letter.");
                break;
            default:
                System.out.println("Not nowel!");
        }

        //3. Way: Dinamik kod elde etmek için kodumuzu uzattık.
        System.out.println("Please enter a letter");
        String letter3 = input.next().substring(0,1);

        switch(letter3){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println(letter3 + " is a vowel");
                break;
            default:
                System.out.println(letter3 + " is not a vowel");

        }
    }

}
