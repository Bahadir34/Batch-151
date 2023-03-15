package javaders.day08stringmanipulations;

public class C01_StringManipulations
{

    public static void main(String[] args)
    {

        //replaceFirst() -> replace() ile aynı işi yapmakla birlikte
        //                  ilk gördüğü datayı değiştirir.


        String str = "Bizimle Java ogrenmek cok kolay!";
        System.out.println(str.replaceFirst("a","*"));

        //Ex : Asagıda fiyatlari verilen urunlerin toplam fiyatini bulunuz.

        String tv = "599.99$";
        String laptop = "299.99$";

        String tv2 = tv.replace("$","");
        String laptop2 = laptop.replace("$","");

        System.out.println("Total Price : " + (Double.valueOf(tv2) + Double.valueOf(laptop2)) + "$");


        // Verilen tamIsim String'inin icindeki ilk ismin ilk harfiyle son ismin ilk harfini buyuk harf olarak
        // yan yana yazdiriniz

        String tamIsim = "    mehmet fatih   ";
        tamIsim = tamIsim.trim();
        System.out.println(tamIsim.split(" ")[0].toUpperCase().charAt(0) + "" +  tamIsim.split(" ")[1].toUpperCase().charAt(0));
    }

}
