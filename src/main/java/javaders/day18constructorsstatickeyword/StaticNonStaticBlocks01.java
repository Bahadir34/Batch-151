package javaders.day18constructorsstatickeyword;

public class StaticNonStaticBlocks01
{

    public StaticNonStaticBlocks01(int price)
    {
        System.out.println("Constructor 1");
    }

    public StaticNonStaticBlocks01(String name)
    {
        System.out.println("Constructor 2");
    }

    public StaticNonStaticBlocks01(boolean isOld)
    {
        System.out.println("Constructor 3");
    }

    public StaticNonStaticBlocks01()
    {
        System.out.println("Constructor 4");
    }

    //"non-static block" constructer'larda çalıştırılması gereken ortak kodları
    //içerir. "non-static block" içine yazılan kodlar her constructer için çalıştırılır.
    //Bir'den fazla non-static block varsa usttekı once calıstırılır.
    {
        System.out.println("I am constructor - ilk");
    }

    {
        System.out.println("I am constructor - ikinci");
    }

    public static void main(String[] args)
    {

        StaticNonStaticBlocks01 obj1 = new StaticNonStaticBlocks01();
        StaticNonStaticBlocks01 obj2 = new StaticNonStaticBlocks01(12);
        StaticNonStaticBlocks01 obj3 = new StaticNonStaticBlocks01("Mehmet");
        StaticNonStaticBlocks01 obj4 = new StaticNonStaticBlocks01(true);

    }

}
