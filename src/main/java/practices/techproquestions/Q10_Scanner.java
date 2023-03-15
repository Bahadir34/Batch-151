package practices.techproquestions;

import java.util.Scanner;

public class Q10_Scanner
{

    public static void main(String[] args)
    {

        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter our name and lastname : ");
        String nameAndLastname = input.nextLine();
        System.out.println("nameAndLastname = " + nameAndLastname);

        System.out.println(nameAndLastname.toUpperCase().charAt(0) +""+ (nameAndLastname.toUpperCase().split(" ")[1].charAt(0)));

        //soyisimin ilk karakterini bulmada 2.yol :

        char lastname = nameAndLastname.charAt(nameAndLastname.indexOf(" ") + 1);
        System.out.println(lastname);

    }

}
