package suleyman_hoca_videolari.stringmanipulations;

import java.util.Scanner;

public class StringManipulations
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first and last name : ");
        String fullName = input.nextLine();

        System.out.println("Full Name : " + fullName);
    /*
        char first = fullName.charAt(0);

        //split metodu stringi parantez içinde belirtilen
        //karaktere göre böler. [] içine girilen index de
        //alınmak istenen kelimeyi belirtir. String bir
        //değer return eder. Bu stringin de alınmak istenen
        //karakteri charAt() metodu kullanılarak alınabilir.
        char last = fullName.split(" ")[2].charAt(0);

        System.out.println("First : " + first + "\nLast : " + last);
    */
        /*
        String işlemlerinde bu şekilde metod zincirleri oluşturulabilir.
        String str1 = input.nextLine().toLowerCase().split(" ")[1];
        */

        //trim metodu stringin başındaki ve sonundaki space karakterini temizler.
        System.out.println("full name : " + fullName.toUpperCase().trim());

        String r = "JAVA";
        String u = "Java";
        boolean same = r.equals(u); //equels metodu iki string birbiri ile aynı mı diye bakar. boolean return eder.
        boolean sameIgnoreCases = r.equalsIgnoreCase(u);

        System.out.println("same : " + same + "\nsameIgnoreCases : " + sameIgnoreCases);

    }

}
