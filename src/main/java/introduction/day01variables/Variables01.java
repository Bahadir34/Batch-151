package introduction.day01variables;

public class Variables01
{
    public static void main(String[] args)
    {
        int age = 13;

        // java cümlesi => Statement
        // Data type + Variable Name => Variable Declaration
        // Assignment Operator (Atama Operatörü) + Variable degeri => Assignment
        /* Eger variable declaration yapar fakat assignment yapmazsak
           java default degeri atar. Sayılar için 0 dır. Stringler için
           default değer "null" dür. null demek 0 demek değildir.
        */
        // null demek içi boş obje demektir.
        // {} => bos küme = null
        //Dil bilgisinde . ne ise javada da ; odur.

        String studentName= "Bahadır Ahmet Ulaş";
        char isminIlkHarfi = 'B';

        int a = 12;
        int b = 13;

        System.out.print(a);
        System.out.println(b);
    }
}
