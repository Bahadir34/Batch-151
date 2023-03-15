package javaders.day09StrinManipulations;

public class C01_StringManipulations
{

    public static void main(String[] args)
    {

        //isEmpty(); -> Bir string data'nın boş mu dolu mu olduğuna bakar.
        //              bize boolean bir değer dönderiri. Sadece hiçlikte true
        //              döndürür.
        //Ex : Bir stringin hiç karakter içermediğini gösteren kodu yazınız.

        String str = " ";

        //1. yol length(); metodu ile
        boolean first = str.length() == 0;
        System.out.println("first = " + first);
        
        //2.yol isEmpty(); metodu ile
        boolean second = str.isEmpty(); //java bu kodu çalıştırırsa daha az yorulur. Bunu kullanmmak daha makbul.
        System.out.println("second = " + second);
        
        
        
        
        //Ex : Bir stringin boşluk haric hiçbir karakter içermediğimini kontrol eden kodu yazınız.
        //1.yol
        boolean spaceHaric = str.replace(" " , "").length() == 0;
        System.out.println("spaceHaric = " + spaceHaric);
    
        //2.yol
        boolean spaceHaric2 = str.replace(" ","").isEmpty();
        System.out.println("spaceHaric2 = " + spaceHaric2);


        //isBlank() methodu : String bir datada space + hiçlik için true döndürür.
        //                    Bos mu dolu mu olduğunu kontrol eder.
        //                    Boolean değer döndürür.
        //                    isEmpty den farki variable da sadece space varsa bos mu
        //                    dolu mu diye sorulduğunda isBlank boş der.
        //                    isEmpty space e boş değil der.
    
        boolean rslt3 = str.isBlank();
        System.out.println("rslt3 = " + rslt3);


        /*
        indexOf() -> Verilen karakter veya karakterlerin ilk görünümünün
                     indexini verir. Tekli karakter için de çoklu karakter
                     için de kullanılabilir.
                     Çoklu datalarda string ifadenin ilk görünümünün ilk karak
                     terinin indexini döndürür.
                     Olmayan bir datanın kaçıncı indexte olduğunu sorgulatırsak
                     bize -1 döndürür.
        */

        // Ex : Bir stringde a, i, e karakterlerinin ilk görünümlerinin
        //      indexleri toplamını ekrarana yazdırın.

        String r = "Java is easy to learn";

        int letterA = r.indexOf('a');
        int letterI = r.indexOf('i');
        int letterE = r.indexOf('e');
        System.out.println("Sum of Indexes : " + (letterE + letterA + letterI));
    
    
    
        // Ex : Bir stringde "Java" kelimesinin ilk olarak kaçıncı indexte 
        //      kullanıldığını gösteren kodu yazınız.
        String u = "Ah Java vah Java sen ne guzel seysin Java";
        int value = u.indexOf("Java");
        System.out.println("value = " + value);


        /*
        Bir stringde a, i, e karakterlerinin son görünümlerinin
        indexleri toplamını ekrana yazdırınız.
         */

        int aEnd = r.lastIndexOf('a');
        int iEnd = r.lastIndexOf('i');
        int eEnd = r.lastIndexOf('e');
        System.out.println("Sum of Last Index of a, e, i : " + (aEnd+iEnd+eEnd));
    }
}
