package practices.techproquestions;

import java.util.Scanner;

public class Q09_Scanner
{

    /*
    Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
    ve bunları şu şekilde konsola yazdırın
    Adı :
    Soyadı :
    Yas :
    Boy :
    Kilo :
     */
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Name : ");
        String name = input.nextLine();

        System.out.print("Lastname : ");
        String lastNAme = input.nextLine();

        System.out.print("Age : ");
        int age = input.nextInt();

        System.out.print("Height : ");
        double height = input.nextDouble();

        System.out.println("Weight : ");
        double weight = input.nextDouble();

        System.out.println("\nName : " + name + "\nLastname : " + lastNAme + "\nAge : " + age + "\nHeight : " + height + "\nWeight : " + weight);

    }
}
