package javaders.day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02
{

    /*
        Method çalışırken dikkat edilmesi gereken kurallar.
        
       1) O method ne iş yapar?
       2) O method nasıl kullanılır?
       3) O method size neyi verir?

     */

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        System.out.println("cities = " + cities);

        //ArrayList'te bir elemanın "ilk gorunumu" nasıl silinir?
        System.out.println(cities.remove("Miami"));
        System.out.println("cities = " + cities);

        //ArrayList'te bir eleman index'i kullanılarak nasıl silinir?
        System.out.println(cities.remove(2));
        System.out.println("cities = " + cities);

        // ArrayList oluştururken en basa ArrayList yerine List de yazabilirsiniz.
        // Sebebini Collections konusunda göreceğiz.
        List<Integer> ages = new ArrayList<>();

        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //Example 1 : 12 elemanını ages Listten siliniz.
        ages.remove((Integer) 12);
        // primitiv int olur, primitiv int remove() method icinde kullanilinca Java onu index sanar.
        // Java'ya 12 nin index olmadigini soylemek icin primitive int yerine wrapper class integer kullanmaliyiz.
        System.out.println("ages = " + ages);

        //Bir List'teki bir elemanın tüm görünümlerini nasıl sileriz?
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        cities.removeAll(citiesToRemove);
        System.out.println("cities = " + cities);

        //Ikı Array'in birbirine eşit olup olmadığını nasıl anlarız?

        List<Character> initials = List.of('a', 'k', 'c', 'd', 'k');
        System.out.println(initials);

        List<Character> initialCharacters = List.of('a', 'k', 'c', 'd', 'k');

        //Iki ArrayList'in birbirine eşit olup olmadıgını nasıl anlarız?
        boolean r1 = initials.equals(initialCharacters);
        //equals() methodu ayni elemanlar ayni index'te oldugu surece true verir.
        System.out.println("r1 = " + r1);

        int r2 = initials.indexOf('k');
        System.out.println("r2 = " + r2);

        int r3 = initials.lastIndexOf('k');
        System.out.println("r3 = " + r3);

        //Example 1 : Bir listteki tekrarsız elemanları console'a yazdıran kodu yazınız.

        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        for (Double w : prices) {
            if (prices.indexOf(w) == prices.lastIndexOf(w)) {
                System.out.print(w + " ");
            }
        }

        System.out.println();

        //Example 2: Bir listte tekrarli elaman olup olmadigini gösteren kodu yaziniz.
        List<Double> height = List.of(2.5, 3.75, 1.25, 4.0);

        int counter = 0;
        for (Double w : height) {
            counter = 0;

            if (height.indexOf(w) != height.lastIndexOf(w)) {
                counter++;
            }
        }

        if (counter == 0)
        {
            System.out.println("All element are unique in the list.");
        }
        else
        {
            System.out.println("At least one element is not unique in the list.");
        }
    }
}
