package javaders.day22stringbuilder;

public class Sb02
{

    public static void main(String[] args)
    {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);
        
        sb1.reverse();
        System.out.println(sb1);
        
        sb1.deleteCharAt(6); //verilen index'teki karakteri siler
        System.out.println("sb1 = " + sb1);
        
        sb1.reverse();
        System.out.println("sb1 = " + sb1);
        
        sb1.delete(4,7); //baslangıc indexlerinden(dahil) bitis index'ine(haric) olan karakterleri siler.
        System.out.println("sb1 = " + sb1);
        
        sb1.replace(3,6,"*"); //replace(2,5,"X") ==> index 2, 3 ve 4 deki characterler yerine X koyar.
        System.out.println("sb1 = " + sb1);

        sb1.insert(3,"2023");
        
        StringBuilder sb2 = new StringBuilder("Lava");
        StringBuilder sb3 = new StringBuilder("Java");

        int r1 = sb2.compareTo(sb3); //r1 = 0 -> eğer compareto() methodu 0 return ederse iki string birbiriyle aynıdır.
        System.out.println("r1 = " + r1); //Sonuc mesela -3 ise sb1 sb2 den alfabetik olarak 3 önde demektir.

        String str = sb2.toString(); //StringBuilder'ı String'e çevirir.

        StringBuilder sb4 = new StringBuilder(str); // stringden StringBuilder'a çevirdik.
        sb2 = new StringBuilder();


    }

}
