package javaders.day25polymorphism;

public class Animal
{

    /*

    1) Parent'taki method ile Child'da override edilen method'un access modifier!lari aynı olabilir.
    2) Child'da Override edilen methodu'un access modifier'ı PArenttaki methodun access modifier'ından dar olamaz.
    3) Parent'taki methodun access modifier'ı Child'da Override edilen method'un access modifier'ından dar olabilir.

    4) Method'un return type'ı "primitive" ise Overrideing yapıldığında "return type" değiştirilemez.
    5) Method'un return type'ı void ise Overriding yapıldığında return type ı değiştirilemez.

    6) Child 'da Override edilen method'un "return type"ı ile PArenttaki methodun return type ı arasında IS-A ilişkisi varsa return type değiştirilebilr.
       Aksi halde değiştirilemez.
       Mesela Integer Wrapper Class ile Long Wrapper Class arasında "IS-A" ilişkisi yoktur, o yüzden return type Integer olduğunda Long'a değiştirilemez.

    7) return type wrapper class olduğunda, overriding yaparken değiştirilemez.

    8) "final method"lar Override edilemezler.
       "final method"ların bodysi değiştirilemez ama Override ederken method body'i değiştirebiliriz. Bu bir çelişkidir.
       Bu yüzden Java final methodların override eilmesine izin vermez.

    9) static methodlar override edilemezler. Çünkü static meethodlar tüm child'lar için ortak methodlardır.
       bir child ortak methodu değiştirdiğinde diğer childlar da bundan etkilenir. Bu etkilenme ummadık sonuçlar
       ortaya çıkarabilir. Bu yüzden java static methodların override edilmesine musaade etmez.
     */

    public void movie()
    {
        System.out.println("Animals move...");

    }


    public int add(int a , int b)
    {
        return (a + b);
    }

    public Animal create()
    {
        return new Animal();
    }

    public Integer multiply(Integer a , Integer b)
    {
        return a*b;
    }

    public final double circleArea(double r)
    {
        return 3.14*r*r;
    }

}
