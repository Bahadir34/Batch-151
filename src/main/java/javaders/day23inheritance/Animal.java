package javaders.day23inheritance;

public class Animal
{

    /*

    1) eat(){} methodu gibi bir çok classın kullanması gereken methodları her class a ayrı ayrı
       yazarsak;
        i) Tekrar yapmış oluruz, tekrar ideal code'da olmamalıdır.
       ii) Aynı methodu tekrar tekrar yazmak zaman kaybıdır.
      iii) Tekrar tekrar yazılan method'un tamiri cok zaman alır.
       IV) Tekrar tekrar yazılan methodun geliştirilmesi çok zaman alır.
        V) Methodu tekrar tekrar yazmak "atomic yapı" ya terstir.

    2) priivate class memberlar child class'lar tarafından kullanılamaz.

    3) Public class member'lar child class'lar tarafından kullanılabilir.

     4) default class member'lar aynı package'de child class'lar tarafından
        kullanılabilir.

     5) "protected" class member'lar farklı package de de olsalar child class'lar tarafından kullanılabilir.

     6) Java'da bir class'ın yalnızca 1 adet parent'ı olabilir.
        Çoklu parent'a "Multiple Inheritance" derler. Tekli parent'a
        "Single Inheritance" derler. (Java single inheritance kullanır.)

     7) Apartman şeklindeki "inheritance"yapisina "Multilevel Inheritance" denir.
        Java "Multilevel Inheritance" i destekler.
     */


    protected void eat()
    {
        System.out.println("Animals eat...");
    }

    public void drink()
    {
        System.out.println("Animals drink...");
    }
}
