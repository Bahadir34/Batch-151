package javaders.day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01
{

    /*
        1)Set'ler tekrarsiz eleman(unique) depolamak için kullanilir.
        2) 3 adet Set Class vardir :
            i. HashSet Class:
                "Hash" benzersiz id olusturma teknigidir. Bu teknige "Hashing Technique" denir.
                "HashSet" elemanları rastgele sıralar
                "HashSet" elemanları sıralamadığından çok hızlı çalışır.
                "HashSet" ler null'ı eleman olarak kabul eder

           ii. LinkedHashSet Class:
                "LinkedHashSet" ler elemanları sizin verdiğiniz siraya gore(insertion order) dizerler.
                 "HashSet" lere gore yavastırlar.
                 "LinkedHashSet"ler tekrarsız eleman depolamak icindir.

          iii. TreeSet Class:
                "TreeSet"ler elemanları natural order'a dizerler
                "TreeSet"ler elemanları natural order'a gore dizdiklerden coooooook yavastırlar.
                En yavas Set "TreeSet"tir.

         3) TreeSet cok yavas olduğundan mumkun oldugu kadar TreeSet kullanmamaya calısırız.
     */

    public static void main(String[] args)
    {

        HashSet<String> hs = new HashSet<>();

        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Ezel"); // Tekrarlı eleman verdiğinizde hata vermez ama tekrarlı elemanı sadece 1 kez ekler.
        hs.add(null);
        hs.add(null);

        System.out.println(hs);

        System.out.println(hs.hashCode()); //2038751948


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        System.out.println("lhs = " + lhs);

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        System.out.println("ls = " + ls);

        lhs.retainAll(ls);
        System.out.println("lhs : " + lhs); //lhs : [87, 124] -> Ilk LinkedHasSet'deki farkli elemanlar silindi.
        System.out.println("ls : " + ls);


        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
        //ts.add(null); //TreeSet'lere "null" eklenemez. Program hata verir.

        System.out.println("ts = " + ts);

        System.out.println(ts.first()); //A
        System.out.println(ts.last()); //Z

        System.out.println(ts.lower('R')); //G ==> Verilen eleman olan R'den bir onceki elemanı verir.
        System.out.println(ts.lower('D')); //A
        System.out.println(ts.lower('A')); //null

        System.out.println(ts.higher('K')); //Verilen 'K' 'den sonraki elemanı verir.
        System.out.println(ts.headSet('R')); // [A, G] ==> Parantez içindeki R dahil değildir.
        System.out.println(ts.tailSet('G')); // [G, R, U, Z] ==> Parantez içindeki G dahildir.
        System.out.println(ts.headSet('R' , true)); // [A, G, R] ==> Parantez içindeki G dahildir.
        System.out.println(ts.tailSet('G' , false)); // [R, U, Z] ==> Parantez içindeki G dahil değildir.

        System.out.println(ts.ceiling('R')); // R ==> Eleman set'in içinde varsa elemanın kendisi return eder
        System.out.println(ts.ceiling('K')); // R ==> Elamn setin içinde yoksa sonraki eleman return eder.
        System.out.println(ts.floor('G')); // G ==> Eleman set'in içinde varsa elemanın kendisi return eder
        System.out.println(ts.floor('J')); // G ==> Eleman set'in içinde yoksa onceki elemanı return eder.

        System.out.println(ts.subSet('G' , 'Z')); // [G, R, U] ==> Ilk parametre dahil ikinci parametre haric.
        System.out.println(ts.subSet('G' , false , 'Z' , true));



    }

}
