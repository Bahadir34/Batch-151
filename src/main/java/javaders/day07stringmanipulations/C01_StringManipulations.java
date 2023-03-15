package javaders.day07stringmanipulations;

public class C01_StringManipulations
{
    public static void main(String[] args)
    {

        String s = "Learn Java earn money, and live happy!";

        //metnin belirli bir datayla bitip bitmediğini
        //true ya da false şeklinde verir.
        boolean result = s.endsWith("money");
        System.out.println("Is string end with \"money\" : " + result);

        //metnin içerisinde parantezde verilen data var mı yok
        //mu diye bakar. Sonucu boolean tipinde return eder.
        boolean isContain = s.contains("money");
        System.out.println("Is String containing \"money\" : " + isContain);

        //s stringindeki "money" kelimesini "dolar" kelimesi
        //ile yer değiştirelim.
        System.out.println("\"dolar\" instead of \"money\" : " + s.replace("money", "dolar"));


        //Ex : String'indeki "earn" kelimesini "win" kelimesine çeviriniz.

        System.out.println(s.replace("earn","win"));

        System.out.println(s.replace("e","***"));

        //stringden bir karakteri silmek istiyorsak silmeyi bu şekilde yaparız.
        //space karakteri ile silme yaılmaz.
        System.out.println(s.replace("e",""));

        System.out.println(s.replace("earn",""));



        //************************ replaceAll() ************************************
    }
}
