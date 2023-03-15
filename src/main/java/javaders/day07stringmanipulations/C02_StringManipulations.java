package javaders.day07stringmanipulations;

public class C02_StringManipulations
{

    public static void main(String[] args)
    {

        /*
        replaceAll() -> Bir grup datayı değiştirmek için
                        kullanılırlar.
                     -> Bir Grup Data : Regular Expression (Regex) kullanılır.
         */
        /*
            En çok kullanılan regexler :

            1) Tum rakamlar = "[0-9]"
            2) Tum kucuk harflar = "[a-z]"
            3) Tum buyuk harfler = "[A-Z]"
            4) Tum harfler = "[a-zA-Z]"
            5) Tum harfler ve rakamlar = "[a-zA-Z0-9]"
            6) Tum sesli harfler = "[aeiouAEIOU]"
            7) Tum noktalama işaretleri = [\\p{Punct}]
            8)den farklı, haricinde : [^]

        */
        String s = "Mehmet Fatih bey 20 yasinda QA_Developer kursunda $ dolarla maas kazanmistir...";

        //Ex : s stringindeki tüm rakamları "*" a çevirin.
        // Tum rakamlar = "[0-9]"
        System.out.println(s.replaceAll("[0-9]","*"));

        //Ex : s stringindeki tüm rakamları ve harfleri @ işaretine çeviriniz.
        System.out.println(s.replaceAll("[a-zA-Z-0-9]","@"));

        //Ex : s stringindeki spaceler dışındaki karakterleri * yapın.

        System.out.println(s.replaceAll("[^ ]","+"));

        //Ex : s stringindeki tüm küçük harfler dışındaki karakterleri * e çeviriniz.
        System.out.println(s.replaceAll("[^a-z ]","*"));
        //NOT : "[^a-z ]" şeklinde yazılırsa boşluk karakterlerine de dokunmaz.

        //Ex : s stringindeki tüm sesli harfler dışıondaki karakterleri & operatörüne çeviriniz.

        System.out.println(s.replaceAll("[^aeiouAEIOU ]","&"));

    }

}
