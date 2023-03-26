package javaders.day24inheritancepolymorphism;


// 1) super() parent'a geçmek için kullanılır.
// 2) this() aynı class içinde farklı constructor'lara gitmek için kullanılır.

public class Toyota extends Car
{

    public void hybrid()
    {
        System.out.println("Toyota is a hybrid car.");
    }

    public Toyota()
    {
        super(5);
        System.out.println("Toyota constructor 1");
    }

    public Toyota(String s)
    {

        System.out.println("Toyota constructor 2");
    }
}
