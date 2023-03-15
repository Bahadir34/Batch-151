package practices.techproquestions;

public class Q07_Ascii
{

    //CEM isminin içinde bulunan harfleri kullanmadan yazdırın

    public static void main(String[] args)
    {

        System.out.println(((char)67) +""+ ((char)69) + ((char)77));


        /* ASCİİ

          B ==> 66           C ==> 67
          D ==> 68           E ==> 69
          L ==> 76           M ==> 77

        */
        char ilkKarakter = 'B' + 1; //c
        char ikinciKarakter = 'D' + 1; //e
        char ucuncuKarakter = 'L' +1; //m

        System.out.println(ilkKarakter+""+ikinciKarakter+ucuncuKarakter);


    }

}
