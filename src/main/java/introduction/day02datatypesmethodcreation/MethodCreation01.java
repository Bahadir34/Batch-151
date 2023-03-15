package introduction.day02datatypesmethodcreation;

public class MethodCreation01
{

    /*
    javada method nasil olusturulur?

   1) main method disinda olusturulur.
   2) Access modifier belirlenir + return type ++ method ismi + () + {method body}

     Olusturulan methodlar nasıl kullanılır?
     1)main methodunun icinden kullanilir.
     2) methodun ismi + ()
     3) Islem yapacaginiz parametreleri parantez icine koyun.
     */

    public static void main(String[] args)
    {
        //toplama islemi yapan bir method olusturun.

        System.out.println(topla(8 , 2));
    }

    public static int topla(int a , int b)
    {
        return a + b;
    }
}
