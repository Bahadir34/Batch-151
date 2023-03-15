package introduction.day03scanner;

import java.util.Scanner;

public class Scanner02
{

    //kullanıcıdan ilk ismini ve soy ismini kullnıcıdan al ve ekrana yazdır
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("First Name : ");
        String firstName = input.nextLine();

        System.out.print("Last Name : ");
        String lastName = input.nextLine();

        System.out.println(firstName + " " + lastName);
    }
}
