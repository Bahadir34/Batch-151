package suleyman_hoca_videolari.day05stringmanipulations;

public class StringManipulations01 
{

    public static void main(String[] args) 
    {
        //Example : Type code to check if the seventh character of a given String is "a" or not
        
        String s = "Alabama state";
        
        //1.way
        boolean result1 = s.charAt(6) == 'a'; //there are 2 task for java.
        System.out.println("Is the seventh character a : " + result1);
        
        
        //2. way
        boolean result2 = s.startsWith("a",6); //there is 1 task for java.
        System.out.println("Is the seventh character a : " + result2);

        //Example : Type code to check if a Strng is ending with "money" or not

        //1.way : substring();



    }
}
