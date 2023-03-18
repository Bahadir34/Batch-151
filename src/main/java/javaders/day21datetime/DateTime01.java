package javaders.day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 
{

    public static void main(String[] args) 
    {
        
        //Anlık zamanı nasıl alırız?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println("myCurrentTime = " + myCurrentTime); //21:03:16.075528800
        
        //Anlık zamanda bileşenler nasıl alınız?
        int hour = myCurrentTime.getHour();
        System.out.println("hour = " + hour);

        //Gelecek ve geçmiş zamana nasıl gidilir?
        LocalTime next = myCurrentTime.plusMinutes(23);
        System.out.println("next = " + next);

        //Zaman formatı nasıl değiştirilir?
        //"hh.mm a" ifadesindeki "a" karakteri ifadeye AM ya da PM koyar. zamanı anlamak için gerekklidir.
        //"mm" minute demektir. "MM" month demektir.
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss a");//HH -> 24 lük saat sistemi , hh -> 12 lik saat sistemini kullanılır.
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);
        
        //Date formatı nasıl olusturulur?
        LocalDate myCurrentDate = LocalDate.of(2022,8,25); //2022-08-25 standart format.
        System.out.println("myCurrentDate = " + myCurrentDate);
        
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println("formattedMyCurrentDate = " + formattedMyCurrentDate);
        
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy"); //25/Aug/22
        String formattedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println("formattedMyCurrentDate2 = " + formattedMyCurrentDate2);

        //Tarihi Gun/Ay ismi Yil şekline ceviriniz -> 25/August/2022
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        //Baska bir zaman dilimindeki tarih ve zamanı nasıl alırız?

        //Tokyo'da ayın kaçı?

        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        LocalDate dateInTaskent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTaskent);

        //tokyoda saat kaç?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeInTokyo = " + timeInTokyo);

    }
    
}
