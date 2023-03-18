package javaders.day21datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime2 
{

    public static void main(String[] args) 
    {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("M/dd/yyyy - hh:mm a");
        String formattedLTD = dtf1.format(ldt);
        System.out.println("formatedLTD = " + formattedLTD);
    }
}
