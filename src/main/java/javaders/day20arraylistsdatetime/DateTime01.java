package javaders.day20arraylistsdatetime;

import javax.security.auth.callback.LanguageCallback;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01
{


    public static void main(String[] args)
    {

        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);

        //tarihten istediğimiz bileşeni nasıl alırız?
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);

        int yearValue = myCurrentDate.getYear();
        System.out.println("yearValue = " + yearValue);

        //Aşağıdaki "Month" bir Enum'dır
        //Enum javada sabit degerleri depolamak için kullanılır.
        Month monthName = myCurrentDate.getMonth();
        System.out.println("monthName = " + monthName);

        //Asagıdakı "DayOfWeek" bir "Enum" dır.
        DayOfWeek dayOfWeek = myCurrentDate.getDayOfWeek();
        System.out.println("Day of Week = " + dayOfWeek);

        System.out.println(myCurrentDate.plusDays(5));
        System.out.println(myCurrentDate.plusMonths(2));
        System.out.println(myCurrentDate.plusYears(4));

        //geçmiş tarihe nasıl gidilir?
        System.out.println(myCurrentDate.minusDays(2));
        System.out.println(myCurrentDate.minusMonths(6));

        LocalDate gokhanDob = LocalDate.of(1986 , 6 , 10);
        LocalDate fatihDob = LocalDate.of(1985 , 2 , 25);

        boolean r1 = gokhanDob.isAfter(fatihDob);
        System.out.println("r1 = " + r1);
        
        boolean r3 = gokhanDob.isEqual(fatihDob);
        System.out.println("r3 = " + r3);



        // Example 1 : Kullanıcıdan alınan tarih geçmişe ait ise "Geçersiz tarih girdiniz."
        // mesajı veriniz.
        //Kullanıcıdan alınan tarih geleceğe ait ise "Zamanı girebilirsiniz." deyiniz.

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter year, month and day numbers in the given order : ");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        
        LocalDate givenDate = LocalDate.of(year,month,day);

        System.out.println("givenDate = " + givenDate);
        if(givenDate.isBefore(LocalDate.now()))
        {
            System.out.println("Invalid date!");
        }
        else
        {
            System.out.println("Enter time for the ticket!");
        }

        System.out.println(myCurrentDate.lengthOfMonth());

        //Example 2 : Kulllanıcının girdiği tarihin gün ismini bulan kodu yazınız.

        System.out.print("Please enter year, month and day numbers in the given order : ");
        int year1 = input.nextInt();
        int month1 = input.nextInt();
        int day1 = input.nextInt();

        LocalDate date = LocalDate.of(year1,month1,day1);
        System.out.println(date.getDayOfWeek());
    }
}
