package javaders.day26abstraction;


/*

1) Bazen parent class'daki methodun body'si hiçbir child tarafindan kullanilmaz.
   Bu durumda parent'daki methoda body yazmak hiç kullanılmadığı için mantıklı değildir.
   Biz de o method'a body yazmayız.

2) Body'si yazılmayan methoda abstract method denir. Abstract ingilizcede "vücutsuz,soyut"
   demektir.

3) Method'un body'sini yazmayında hata verir. Biz de abstract keyword'unu kullanarak javaya bu
   methodun body'si olmayacak deriz.

4) "abstract" keyword'unu kullanınca elde ettiğimiz abstract method normal classlara konulamaz.
   O yüzden class'ı da abstract yaparız.

5) parent'taki method abstract ise bütün child methodlar o methodu override etmek zorundadır. Bu
   yüzden tüm child'lar için mecburi olmasını istediğimiz fonksiyonları abstract yapmak mantıklı bir
   seçimdir.

6) Body'si olan methodlar(Concrete Method) abstract class'ların içine yazılabilir. Abstract methodlar
   concrete classların içine yazılamazlar.

7) "abstract" keyword ile " method body" bir method'da aynı anda bulunamaz.

8) "abstract class" ların içinde "abstract method" lar olur, "abstract method"lar body'si olmadığından "eksik method"lar
   gibi düşünülebilir.
   Yani abstract class içinde eksik bir yapı barındırır, siz abstract class'dan object uretirseniz abstract içindeki
   eksiklik object'e yansır
   ve object eksiği olan bir object olmuş olur.
   Java bunu istemez çünkü eksik object eksik iş yapar, bu da application'ın yanlış calışmasına sebep olur.
   Java application'u korumak için "abstract class" lardan object üretilmesini engellemiştir.

9) "Abstract class" ların constructor'ı vardır fakat object oluşturamazlar.

10) "Final method"lar abstract olamazlar.

11) "private method"lar abstract olamazlar.

12) "Abstract class" ın abstract child'ı veya concrete child'i olabilir.
 */


/*

"final" keyword'u aciklar misiniz?
+Variable'larda     +methodlarda        +classlarda
kullanılır.

i. variable'larda kullanıldığında
    a)Vaiable'a kesinlikle deger ataması yapılmalıdır.
    b)ilk atanan değer değiştirilemez.

ii. method'larda kullanıldığında
     a)o methodun body'si değiştirlemez
     b)o method override edilemez.

iii. clarrlarda kullanıldığında
     a)O class'ın child class'ı olamaz ama final class'ın kendisi child olabilir.

 */

public abstract class Courses
{

    public abstract void math(); //yarım method, child'ları tarafından tamamlanmak zorunda.

    public void art() //tam method
    {
        System.out.println("Learn art...");
    }


}
