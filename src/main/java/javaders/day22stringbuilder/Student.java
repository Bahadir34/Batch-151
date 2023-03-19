package javaders.day22stringbuilder;

public class Student
{

    /*
        * Aynı package de "public" access modifier ile "default"
          access modifier arasında fark yoktur.

        * Farklı package'da "public" access modifier'a ulaşışır ancak
          "default" access modifier'a ulaşılamaz.

        * access modifier'ı "private" olan class member'lar sadece
          oluşturuldukları class içerisinden görülebilirler. Oluşturuldukları
          class ın dışına çıkıldıklarında gorunmez, ulaşılmaz olurlar.

        * Class'lar public ve default olabilir ama private ve protected olamaz.

     */

    //stdName public oldugu için diger class'lardan ulaşılabilir.
    public String stdName = "Ali Can";

    int age = 23;

    //Bu class'ın dışında erişilemezler.
    private String healthCondition = "Cancer";

    //Access modifier ı "protected" olan Class Member'lar aynı package içinde iken "public" gibi davranır.
    //Farklı package a gectiginizde "protected" olanlar sadece vhild class'lardan ulaşılabilirler.
    protected int salary = 3000;
}
