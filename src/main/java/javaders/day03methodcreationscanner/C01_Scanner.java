package javaders.day03methodcreationscanner;
import java.util.Scanner;


public class C01_Scanner
{
    public static void main(String[] args)
    {

        /*

        Kullanıcıdan data almak için scanner class'ı kullanılır.
        Bir input/ scan / scanner objesi oluşturulur.
        Bu objeyi new keywordu ile oluştururuz.


         */
        Scanner input = new Scanner(System.in);

        /*
        System.out.print("Lütfen Maaşınızı Giriniz : ");
        long salary = input.nextLong();
        System.out.println("Salary = " + salary);
        */

        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini , soran bir program yaziniz

        char gender;
        String name, country;
        double height, weight;
        boolean countryLove;

        System.out.print("Name : ");
        name = input.nextLine();

        System.out.print("Gender(M/F) : ");
        gender = input.next().charAt(0);

        System.out.print("Country : ");
        input.nextLine(); //dummy olarak eklenmiştir. javanın bugı olan bir durumdur. bu işe dummy atma denir.
        country = input.nextLine();

        System.out.print("Height : ");
        height = input.nextDouble();

        System.out.print("Weight : ");
        weight = input.nextDouble();

        System.out.print("Do You Love Your Country? (true/false) : ");
        countryLove = input.nextBoolean();

        System.out.println("\nName : " + name + "\nGender : " + gender + "\nCountry : " + country + "\nHeight : " + height + "\nWeight : " + weight + "\nDo you love your counry : " + countryLove);


    }
}
