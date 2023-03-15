package practices.invidualquestions;

import java.util.List;

public class Q64
{
    /*

    Bir string listede verilen en dusuk ve en buyuk fiyatın toplamını bulunuz.
     */

    public static void main(String[] args)
    {

        List<String> prices = List.of("$15.25" , "$21.85" , "$14.35" , "$32.75");
        double min = Double.valueOf(prices.get(0).replace("$" , ""));
        double max = Double.valueOf(prices.get(0).replace("$" , ""));

        for (String w : prices)
        {
            if(min < Double.valueOf(w.replace("$" , "")))
            {
                min = Double.valueOf(w.replace("$" , ""));
            }

            if(max > Double.valueOf(w.replace("$" , "")))
            {
                max = Double.valueOf(w.replace("$" , ""));
            }
        }

        System.out.println("max = $" + max);
        System.out.println("min = $" + min);

    }
}
