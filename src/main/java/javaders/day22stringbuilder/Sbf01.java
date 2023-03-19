package javaders.day22stringbuilder;

public class Sbf01
{

    /*
    1) StringBuffer Java'da String ureten bir Class'dir.
    2) StringBuffer, StringBuilder'a çok benzer, yani ikisi de mutable String uretir.
    3) StringBuffer "multi-thread" dir ama StringBuilder "multi-thread" değildir.
    4) Java StringBuffer'ı StringBuilder'dan önce oluşturdu.
    5) StringBuilder multi-thread olmadığı için StringBuffer'dan daha hızlı çalışır.
    6) 3 tane String olusturan Class ogrendik.
        1)immutable string lazimsa; String Class
        2)mutable string lazimsa; StringBuilder veya StringBuffer
               i)StringBuilder'i multi-thread gerekmezse kullaniriz.
              ii)StringBuffer'i multi-thread gerekirse kullaniriz.

     7) Multi-thread yapılırken yapılan işlerin sıralaması onem arzeder, yapılan işleri
        mantıklı bir sıraya koymak "synchronization" olarak adlandırılır.
        StringBuffer "multi-thread" olduğu için aynı zamanda "synchronized" dir.
     */

    public static void main(String[] args)
    {
        StringBuffer sbf1 = new StringBuffer("Java");



    }

}
