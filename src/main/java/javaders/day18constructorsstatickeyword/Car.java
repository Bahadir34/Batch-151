package javaders.day18constructorsstatickeyword;



/*
    1) Constructor nasıl oluşturulur?
        Access modifier + Class name + () + {}

    2) "Method" ile "Constructor" arasındaki farklar nelerdir?
            * methodlarda return type olur, constructor'larda olmaz.
            * methodlar yaptıkları işe göre isimlerdirilirler, constructorlar ise
              her zaman class ismi ile isimlendirilirler.
            * methodlar bir aksiyon yapmak için oluşturulurlar, constructorlar ise
              bir obje oluşturmak için oluşturulurlar.
            * method isimleri kucuk harfle baslar. Constructor isimleri class ismiyle
              aynı olduğu için buyuk harfle baslar.

     3) Parametreli constructor'lar olustusrarak aynı class'dan farklı ozelliklere sahip
        object'ler olusturabiliriz.

 */

public class Car
{
    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    int price = 18000;

    //1.)Default Constructor
    //2.)Default constructor'lar parametre kullanmazlar.
    //3.)Default constructorların body'si boştur.

    //4.)Java kıskançtır. Siz default constructor'ı elle yazdığınızda
    //java object class içindeki default constructor'ı kullandırtmaz.
    public Car()
    {

    }

    //Custom Constructer.
    public Car(String make, String model, int year, int price)
    {
        //"this" keyword'unun anlamı "bu class" demektir.
        // bu class'taki make'i make e atar. yani parametre
        //atanabilir.

        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String make)
    {
        this.make = make;
    }

    public Car(String make, int price)
    {
        this.make = make;
        this.price = price;
    }

}
