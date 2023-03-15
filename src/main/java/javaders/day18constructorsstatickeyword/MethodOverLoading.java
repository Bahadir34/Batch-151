package javaders.day18constructorsstatickeyword;

public class MethodOverLoading
{

    /*

    1) Bir method aynı isim ve farklı parametrelerle olusturulursa buna "Method Overloading" denir.
    2) "Method Overloading" Java'da iyi organizasyon için önemlidir.
    3) Method Overloading yaparken parametre 3 şekilde degistirilebilir
        i. Parametrelerin sayıları degistirilebilir.
       ii. Parametrelerin data tipleri değiştirlebilir.
      iii. Parametrelerin data tipleri farklıysa yerleri değiştirilebilir.
     4) "Method Overloading" bir class'ın icinde oluşur. Bu yüzden "private method"lar da
        overload edilebilir.
        "Method Overloading" bütün access modifier lar için kullanılabilir.
     5)"static" methodlar overload edilebilirler.
     */


    public static void main(String[] args)
    {

    }

    public static int add(int a , int b)
    {
        return a+b;
    }

    public static int add(int a , int b , int c)
    {
        return a+b+c;
    }

    public static double add(double a , int b)
    {
        return a+b;
    }

    public static double add(int a , double b)
    {
        return a+b;
    }
}
