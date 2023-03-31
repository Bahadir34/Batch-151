package javaders.day29collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList01
{


    /*
        1) LinkedList'ler node silme ve ekleme'de cok basarili oldukları icin,
           silme ve ekleme islemlerini coklukla yapacağınız zaman LinkedLinks kullaniniz.

        2) ArrayList'ler index'leri adres gibi kullanir, bu yüzden ArrayList'ler "search" islemlerinde cok basarılıdırlar.
           NOTE : İhtiyacınız olan collection coğunlukla silme ve ekleme islemleri yapacaksa(muze ziyaretçileri gibi) LinkedList,
                  "search" islemleri yapacaksa (Amerika eyaletleri gibi) ArrayList kullaniniz.
     */

    public static void main(String[] args)
    {
        LinkedList<String> s = new LinkedList<>();

        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");
        System.out.println(s);//[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]

        //s.remove(2);//Ajda
        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra, Ajdar]

// s.remove("Ajdar");
        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra]

        //s.remove();
        System.out.println(s);//[Steve, Esen, Muge, Cuneyt, Esra]

        //s.removeFirstOccurrence("Esra");
        System.out.println(s);//[Esen, Ajda, Muge, Cuneyt, Esra]

        //s.removeLastOccurrence("Esra");
        System.out.println(s);//[Kemal, Esra, Steve, Esen, Ajda, Muge, Cuneyt, Ajdar]

        String r1 = s.peek(); //Ilk elemanı silmeden size verir. (copy + paste)
        System.out.println(r1); //Kemal
        System.out.println(s); //[Kemal, Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        String r2 = s.poll(); //İlk elemanı size verir ve onu list'ten siler. (Cut + Paste)
        System.out.println(r2); //Kemal
        System.out.println(s); //[Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]



        /*
            Retrieves, but does not remove, the head (first element) of this list.
            Returns : the head of this list
            Throws : NoSuchElementException – if this list is empty
            Note : peek() ile element() ikisi de ilk elemani size silmeden verir.
                   Ama peek() list bos oldugunda size null veriri, element ise hata verir.
         */
        String r3 = s.element(); //Ilk elemanı silmeden size verir (copy + paste)
        System.out.println(r3);
        System.out.println(s);

        s.pop();

        /*
        Note : poll() ile pop() ikisi de ilk elemanı siler -v size verir.
        Ama poll() list bossa size null verir, pop() ise hata verir.
         */

    }
}
