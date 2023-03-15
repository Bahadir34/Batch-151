package javaders.day13loops;

import java.util.Locale;

public class Loops01
{
    /*
    21 den 180 e kadar hem 4 hem de 6 ile bolunebileen tamsayilari console
    a yazdirin/
    */

    public static void main(String[] args)
    {

        for (int i = 21;i<181;i++ )
        {
            if(i%4 == 0 && i%6 == 0)
                System.out.print(i + " ");
        }


        //Size verilen kucuk harfle yazilmis String'in indexi cift sayi olan character'lerini buyuk harfe donusturunuz

        System.out.println();

        String s = "miami";

        for (int i = 0; i<s.length();i++)
        {
            if(i%2 == 0)
            {
                System.out.print(s.toUpperCase().charAt(i));
            }
            else
            {
                System.out.print(s.toLowerCase().charAt(i));
            }
        }


        System.out.println();
        /*
        Verilen bir stringdeki ilk 'a' harfinden onceki tum characterleri console a yazdırınız.
        Hello Java ==> Hello J
         */
        String s1 = "Hello Java";

        for(int i = 0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);

                if(ch == 'a')
                {
                    break; //loop'u herhangı bır sarta gore kırmak ıcın break keyword kullanılır.
                }
                else
                {
                    System.out.print(ch);
                }
        }

        System.out.println();
        //verilen bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        String s2 = "Tokatcı";

        for (int i = s2.length()-1 ; i>=0 ; i--)
        {
            if(s2.charAt(i) == 'a')
                break;
            else
                System.out.print(s2.charAt(i));

        }
    }

}
