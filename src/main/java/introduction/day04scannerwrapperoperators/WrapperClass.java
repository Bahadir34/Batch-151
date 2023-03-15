package introduction.day04scannerwrapperoperators;

public class WrapperClass
{
    public static void main(String[] args) {

        /*

        primitive     :  char       -    boolean - byte - short  -    int   - long -  float - double
        wrapper class : Character   -    Boolean - Byte - Short  -  Integer - Long  - Float - Double
         */

        // wrapper class non primitive dir. o yüzden çok yer kaplarlar.
        // o yüzden wrapper class kullanmayı tercih etmeyiz.
        // böyle bir imkanın varlığından da haberdar olmalıyız.

        int n = 12;
        Integer m = 26;

        byte mehmet = 21;
        Byte davut = 28;
        System.out.println(Short.TYPE);

        //int data type ının minimum değeri ile byte data typının max değerlerinin toplamını bulunuz.

        System.out.println("Sonuc : " + (Integer.MIN_VALUE + Byte.MAX_VALUE));

        //primitive int'i wrapper Integer'a ceviriniz
        int num = 13;
        Integer wrapperNum = num; //bu metoda autoboxing denir.

        //Wrapper Byt'ı primitive byte'a ceviriniz.
        Byte k = 33;
        byte primitiveK = k; //bu işleme unboxing denir.



        /*
            NOT :
                    Autoboxing : primitive datayı wrapper yapmak demektir.
                    Unboxing : wrapper olan datayı primitive yapmak demektir.
         */


        //ORNEK : Primitive char'ı wrapper Character e çeviriniz.

        char karakter = 'M';
        Character wrapperKarakter = karakter;


        //Wrapper boolean ı primitive boolean a çevir.

        Boolean a = true;
        boolean b = a;
    }
}
