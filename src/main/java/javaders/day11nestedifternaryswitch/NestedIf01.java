package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01
{

    //equalsIgnoreCase() -> Büyük küçük harf duyarlılığına bakmaz.

    public static void main(String[] args)
    {
         /*
Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz

 */


        /*
        if içinde if kullanırsanız nested if oluşturmuş demeksinizdir.

        nested if java yı yavaşlatır bu yüzden mecbur kalmadıkça kullanmayız.

        nested if gibi javayı yavaşlatan kodlar "Time Consuming" olarak adlandırılır.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int age = input.nextInt();

        System.out.print("Please enter your gender : "); //male or female
        String gender = input.next();

        if(age < 0 || age > 120)
        {
            System.out.println("Negative ages or greater than 120 are invalid.");
        }

        else if(gender.equalsIgnoreCase("male"))
        {
            if(age > 65)
            {
                System.out.println("Can be retired");
            }
            else
            {
                System.out.println("Should work");
            }
        }

        else if (gender.equalsIgnoreCase("female"))
        {
            if(age > 60)
            {
                System.out.println("Can be retired");
            }
            else
            {
                System.out.println("Should work");
            }
        }

        else
        {
            System.out.println("Undefined gender");
        }
    }
}
