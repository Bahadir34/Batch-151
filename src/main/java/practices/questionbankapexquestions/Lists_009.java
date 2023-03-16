package practices.questionbankapexquestions;

import java.util.ArrayList;

public class Lists_009
{

    /*
    String bir listede verilen tüm fiyatların toplamını bulunuz.
    Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
    */

    public static void main(String[] args)
    {

        ArrayList<String> prices = new ArrayList<>();
        prices.add("$12.99");
        prices.add("$23.60");
        prices.add("$54.45");

        double toplam = 0;

        for (String w : prices)
        {
            toplam += Double.parseDouble(w.replace("$" , ""));
        }

        System.out.println("$" + toplam);

    }

}
