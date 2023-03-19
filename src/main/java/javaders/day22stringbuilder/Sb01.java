package javaders.day22stringbuilder;

public class Sb01
{

    /*

    1)"StringBuilder" String ureten bir Class'dir;
    2)String Class kullanarak String uretiriz. Java nicin "StringBuilder" Class'ı da olusturdu.
      "String" Class "immutable"(değiştirilemez) String uretir, "StringBuilder" Class "mutable"
       (değiştirilebilir) String uretir.
    3)"immutable" olmak demek orjinal degerin korunması, degistirilemez olması demektir.
      "mutable" olmak demek orjinal degerin değiştirilebilir olması demektir.
      4)"capacity" Java'nın size verdiği data depolama yer sayisidir. Length ise size verien data
        depolama yerinin kullanılan kısmıdır.
      5)Java başlangıç olarak capacity'i baslangıc olarak 16 verir. Siz verilen capacity'yi aşarsanız
        Java yeni capacity'yi varolanın 2 katının 2 fazlası olacak sekilde değiştirir.
     */


    public static void main(String[] args)
    {
        String s = "Java";
        
        s= s + "!";
        
        String u = "Apex";
        String v = "Apex";
        String y = "C++";
        
        
        //StringBuilder'lar nasıl oluşturulur?
        
        //1.way
        StringBuilder t = new StringBuilder("Python");
        System.out.println("t = " + t);

        //StringBuilder'lara nasıl ekleme yapılabilir?
        t.append("!").append("...");
        System.out.println("t = " + t);
        
        //2.way
        StringBuilder r = new StringBuilder();
        r.append('c');
        System.out.println("r = " + r);

        //"capacity" ve "length" arasındaki fark nedir?
        StringBuilder sb1 = new StringBuilder("Money");

        System.out.println("Capacity : " + sb1.capacity());//21
        System.out.println("Length : " + sb1.length());//5

        sb1.append("!");
        System.out.println("sb1.capacity() = " + sb1.capacity());//21 -> 21 eski kapasitemiz.
        System.out.println("sb1.length() = " + sb1.length());//6

        sb1.append(".................");
        System.out.println("sb1.capacity() = " + sb1.capacity()); //21 x 2 = 44
        System.out.println("sb1.length() = " + sb1.length()); //23


        //Default capacity'i degistirebilir miyiz?
        StringBuilder sb2 = new StringBuilder(2); //baslangic capacity'sini belirliyoruz.
        System.out.println("sb2.capacity = " + sb2.capacity());

        //sb2.append("...");
        //System.out.println("sb2.capacity = " + sb2.capacity());

        sb2.append("..........");
        System.out.println("sb2.capacity = " + sb2.capacity());

    }

}
