package practices.invidualquestions;

import java.util.ArrayList;
import java.util.List;

public class Q63
{

    // String bir listede verilen tüm fiyatların toplamını bulunuz.
    //{"$15.25" , "$21.85" , "$14.35" , "$32.75"}

    public static void main(String[] args)
    {

        List<String> prices = List.of("$15.25" , "$21.85" , "$14.35" , "$32.75");
        
        double toplam = 0;
        
        for (String w : prices)
        {
            toplam += Double.valueOf(w.replace("$" , ""));
        }

        System.out.println("toplam = " + toplam);

    }

}
