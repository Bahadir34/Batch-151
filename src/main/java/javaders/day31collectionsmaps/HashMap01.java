package javaders.day31collectionsmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;


public class HashMap01
{

    /*

    MY NOTES:
    Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
    "key" kismi tekrarsiz, "value kismi tekrarlı olabilir.
     -Mapler "key" ve "value" structur'ini kullanir.-
    Map'lerdeki elemanlara "entry" denir.
    Elemanlarin tamanina ise "EntrySet" denilir.
    Entry'ler tekrarsiz oldugu icin "EntrySet" denilir
    "Key" ve "Value" lar ayrı ayrı data tiplerinde olabilirler.

    HashMap'ler "entry"leri rastgele sıralar. Bu yüzden en hızlı mapdir.
    "Map" ler collection değildir. Tamamıyla farklı bir yapıdır.

     */

    public static void main(String[] args)
    {
        //Map nasıl oluşturulur?
        HashMap<String , Integer> countryPopulation = new HashMap<>();

        //Map'e entry nasıl eklenir?
        countryPopulation.put("Germany" , 83000000);
        countryPopulation.put("Albania" , 3000000);
        countryPopulation.put("USA" , 400000000);
        countryPopulation.put("Turkey" , 83000000);
        countryPopulation.put("Netherland" , 18000000);

        System.out.println("countryPopulation = " + countryPopulation);


        // get() methodu "key" ile calisir ve "value" kismini verir
        System.out.println(countryPopulation.get("USA"));

        //keySet() methodu bize bütün key'leri verir.
        Set<String> keys = countryPopulation.keySet(); //methodun içine girip return edilen datanın return tipini öğrenin. Return edilen datayı o tipte bir container'a koyun.
        System.out.println("keys = " + keys); //keys = [Netherland, USA, Turkey, Germany, Albania]

        // butun value'ları nasıl alabılırım?
        Collection<Integer> values = countryPopulation.values();
        System.out.println("values = " + values); //values = [16000000, 400000000, 86000000, 83000000, 3000000]


        //Example 1 : countypopulation map'indeki ulkelerin nufuslarının ortalaması nedir?
        int sumOfPopulations = 0;
        for(Integer w : countryPopulation.values())
        {
            sumOfPopulations += w;
        }

        System.out.println("Average Of Countrie's Population : " + sumOfPopulations / values.size());

        //enetrySet() "entry"leri aklip halinde alip bize "Set"in icine koyarak verir.
        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println("entries = " + entries); // entries = [Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]
        
        
        //Example 2 : countryPopulation map'indeki ulkelerin isimlerinin karakter sayısı ile nüfuslarının tolamını bulunuz.
        
        int toplam = 0;
        
        for(Map.Entry<String,Integer> w : entries)
        {
            toplam += w.getKey().length() + w.getValue();
        }

        System.out.println("toplam = " + toplam);
    }

}
