package javaders.day21datetime;

public class Varargs01
{

    public static void main(String[] args)
    {
        System.out.println(add(5));
        getInitials("Mehmet Can" , "Bahadır Ahmet" , "Mina Nur");


    }

    //Toplama işlemi yapan bir method oluştur.
    //Aşağıdaki gibi farklı methodlar oluşturarak iş yapamayız. Çünkü kullanıcı farklı sayıdaki sayıları toplamak isteyebilir.
    //Her ihtimal için bir method oluşturmak mümkün değildir.

/*
    public int add(int a , int b)
    {
        return a+b;
    }

    public int add(int a , int b , int c)
    {
        return a+b+c;
    }

    public int add(int a , int b , int c , int d)
    {
        return a+b+c+d;
    }
*/
    //Farklı sayıdaki parametrelerin hepsini kabul eden bir yapı oluşturdu. Bu yapıya Varargs denir.
    //Varargs arkada array yapısını kullanır.
    //Bir method parantezinde birden fazla Varargs kullanılamaz.
    //Bir method parantezinde birden fazla parametre kullanılacaksa Varargs en sonra olmalıdır.
    public static int add(int b , int... a)
    {
        int sum = 0;
        for(int w : a)
        {
            sum += w;
        }

        return sum;
    }
    //Exampla 2 : Verilen isimlerin ilk harfini konsola yazdıran methodu oluşturun.

    public static void getInitials(String... s)
    {
        String initials = "";

        for (String w : s)
        {
            initials = initials + w.charAt(0)+w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";
        }
    }
}
