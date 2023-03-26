package javaders.day27interface;

/*

    1) "interface" içine concrete method konulamaz.
    2) "interface" çindeki methodların abstract olduğunu java bilir
       bu yüzden interface içindeki abstract methodlarda acstract keyword
       kullanmaya gerek yoktur.
    3) interface içindeki abstract methodların tamamı publictir. Bu yüzden
       interface içindeabstract method oluştururken access modifier yazmaya
       gerek yoktur.
    4) Bir interface'i bir class'ın parent'ı yapmak istediğinizde "extends"
       keyword yerinde "implements" keywordu kullanınız.
    5) "Concrete Child Class" lar "parent interface" deki "abstract method" ları
       override etmek zornundadırlar.
    6) "interface" ler bir applicationda "Concrete Child Class" ların yapmak zorunda
       oldukları fonksiyonları barındırırlar. Bu üzden interfacelere "to-do list" de denir.
    7) Birden fazla "parent interface" icinde aynı ısımlı abstract methoflat oluşturabilirsiniz.
       abstract methodların body'si olmadığı için child class'lar aynı isimli methodlardan
       herhangi birini overdide ederek kullanabilirler.
    8) Birden fazla "parent interface" icinde aynı isimli abstract methodlar oluşturduğunuzda bu methodların
       return type ları aynı olmak zorundadır.
    9) Normalde "interface" icine "concrete method" konulamaz ama bazı ozel durumlarda "concrete method"
       koymamız gerekirse "default" keyword'unu asağıdaki gibi kullanarak "interface" icine "concrete method"
       koyabiliriz. static keywordu de interdace içinde concrete method oluşturmamıza yarar.
            i. default void eco(){ System.out.println("Uses gas less..."); }
            ii. static void stop() { System.out.println("Stops securely..."); }
   10) "default" veya "static" keywordunu kullanarak oluşturduğumuz concrete method ların concrete child
       class lar tarafından kullanılma zorunluluğu yoktur.
   11) "default" keywordunu kullanarak oluşturduğumuz concrete methodlara object olusturarak ulaşılabiir.
       "static" keywordunu kullanarak oluşturduğunuz concrete methodlara ulaşmak için object oluşturmaya gerek yoktur interface ismi yeterlidir.
   12) interfacelerden object oluşturulamaz. interfacelerin constructor ı yoktur.
 */

public interface Engine
{

    void start();
    void payment();

    default void eco()
    {
        System.out.println("Uses gas less...");
    }

    static void stop()
    {
        System.out.println("Stops securely...");
    }
}
