package javaders.day28interface;


/*      Child    Parent
    1) Class --> Class : extends
       interface --> interface : extends
       Class --> interface : implements
       interface --> Class : Olamaz

       Anı ise "extends" , farklı ise "implements" kullan.
       interface'i Class'ın child'ı yapma.
 */


/*
    abstract class ile interface arasindaki farklar nelerdir?
    *1) Abstract classlar hem abstract hem de concrete method içerebilir fakat interface ler sadece abstract method içerir.
       ama interface lerde istersek default ve static keywordlerini kullanarak concrete method üretebiliriz.
    **2) Abstract classlar multiple inheritance'i desteklemez ama interfaceler destekler.
    ***3) Abstract classlar içinde her turlu variable oluşturulabilir, interfaceler içindeki variable lar public, static ve final olmak zorundadır.
    4) "interface" "class'ın" child'ı olamaz ama "abstract class" "class'ın" child ı olabilir.
    5) "Abstract class"larda constructor vardır ama object uretemez, interface'lerde constructor yoktur, bu yüzden object uretilemez.
 */

public interface Mammal extends Animal
{
    String feedBaby = "Milk";
    int age = 6;
}
