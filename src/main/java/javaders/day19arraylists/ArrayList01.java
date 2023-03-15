package javaders.day19arraylists;

import java.util.ArrayList;

public class ArrayList01
{


    /*

    1)Array data type'indeki coklu data'ları depolamak için Array kullanırız.
    2)Array'lerin bir negatif yonu var; icine koyacağınız eleman sayısını en basta belirlemek zorundasınız.
    3)Array'ler eleman sayısında esnek değildirler, bu tüzden java "ArrayList" adli yeni bir yapi olusturdu.
      bu yapı eleman sayısında esnektir. Hiç eleman koymazsanız eleman sayısını sifir olarak ayarlar, 1000
      eleman koyarsaniz eleman sayisini 1000 olarak ayarlar.
    4)"ArrayList" yerine sadece "List" de diyebiliriz.
    5)Java "ArrayList"leri olusturduktan sonra Array'leri iptal etmedi cunku;
        i. Array'ler super hizlidir.
       ii. Array'ler memory'de coook az yer kaplar.

    6)Array'ler primitive data type'ları ve reference'ları depolayabilir ama "ArrayList"ler "non-primitive" data type'larını
      depolar. Bu yüzden "ArrayList" ler Array'lerden daha çok yer kaplar.


     */

    public static void main(String[] args)
    {
        //Array List nasıl oluşturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println("ages = " + ages);

        //ArrayList'e nasil eleman eklenir?
        
        //1.way
        ages.add(12);
        ages.add(24);
        ages.add(9); // add methodu elemanları "giriş sırasına"(insertion order) göre list'e yerlestirir.

        //ArrayList console'a nasıl yazdırılır?
        System.out.println("ages = " + ages);


        //2.way
        ages.add(1 , 99);
        System.out.println("ages = " + ages);
        
        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);
        
        //3.way
        ages.addAll(price);

        System.out.println("ages = " + ages);
        ages.addAll(3,price);
        System.out.println("ages = " + ages);

        System.out.println("size of List : " + ages.size());
        System.out.println(ages.get(2)); //get() methodu index kullanarak istediğimiz elemanı almaya yarar.

        //Array List'de spesific bir karakter nasıl değiştirilir?
        ages.set(6,111);
        System.out.println("ages = " + ages);
        
        boolean r1 = ages.contains(919);
        System.out.println("r1 = " + r1);

        //Bir ArrayList'in boş olup olmadığını nasıl kontrol ederiz?
        boolean r2 = ages.isEmpty();
        System.out.println("r2 = " + r2);

        //Bir ArrayList'teki tüm elemanları nasıl sileriz?
        ages.clear();
        System.out.println("ages : " + ages);
        System.out.println(ages.isEmpty());


        //Example 1 : Bir List'in boş olup olmadığını kontrol edern kodu yazını.

        ArrayList<String> names= new ArrayList<>();

        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Angelina");
        names.add("Brad");

        //1.way
        if(names.size() == 0)
        {
            System.out.println("List is empty!");
        }
        else
        {
            System.out.println("List has got at least one element!");
        }

        //2.way
        if(names.isEmpty())
        {
            System.out.println("List is empty!");
        }
        else
        {
            System.out.println("List has at least one element!");
        }
    }

}
