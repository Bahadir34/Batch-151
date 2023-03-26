package javaders.day24inheritancepolymorphism;


/*

1) İnheritance'de object oluştururken constructor'lar yukarıdan(Parent)
   asagıya(Child) dogru calısır.

2) Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.

3) super() her constructor'in ilk satirinda gorunmez olarak bulunur.
  Isterseniz gorunur sekilde de yazabilirsiniz

4) super() sizi parent class'daki constructor'a taşır.

5) this() sizi aynı class içindeki constructor'lar arasında gezdirir.

6) "this" içinde bulunduğunuz class'daki variable'ları cağırmaya yarar.
   "super" parent class'daki cariable'lari cağırmaya yarar.

7) Eger data tipleri arasında "IS-A" ve "HAS-A" ilişkisi varsa bu data typle'lerinde
   "COVARIANT" denir.

 */

/*

1) Polymorphism ==> Çoklu şekil
    Yani bir method'un farklı şekillerle karşımıza çıkmasıdır.
    Polymorphism = Overloading(+) + Overriding(-) {(+) öğrendik demek.}

2) Overriding, parent class'daki method'u child class'ın ihityaçlarına gore ozelleştirerek kullanmak demektir.

 3) Overriding'de method'un body'si değiştirilir. Başka bir şeye dokunulmaz.
 */

public class Car
{
    public void move(){
        System.out.println("Cars move...");
    }

    public void getbreak(){
        System.out.println("Cars break...");
    }

    public void engine(){
        System.out.println("Cars have engine ...");
    }

    public String model = "Car";
    public int price = 0;


    //Butun Constructor'larin ilk satirinda gorunmez bir kod vardir ==> super();
    //Bu kod Parent'i temsil eder ve parent'e yonlendirir
    public Car()
    {
        System.out.println("Car Constructor 1");
    }

    public Car(int i)
    {
        this();
        System.out.println("Car Constructor 2");
    }
}
