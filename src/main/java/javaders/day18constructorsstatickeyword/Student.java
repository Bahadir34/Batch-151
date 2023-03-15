package javaders.day18constructorsstatickeyword;

public class Student
{

    /*

    1) "Static" "class member"lar (variable + method + constructor + code blocks) tum
       object'ler tarafından paylaşılır.

    2) "Static" "class member"lardaki degisiklikler tum object'ler tarafından farkedilir.

    3) "Static" "class member"lar gokteki ayın dunyaya baglı oldugu gıbı class'a baglıdırlar.
       Bu yuzden "static variable" lara "class variable" da dednir.
    4) "static" "class member"ların nasıl çalıştığını anlamak için çizim yapıp static
       olanları class'a olmayanları objeye baglayarak dusunmek bu konuyu kolaylastırır.
    5) "Static" "class member"ları cagırmak ıcın object olusturmak gerekmez ve tavsiye edilmez.
         "non-static" "class member" ları cagırmak ıcın object olusturmak gerekır.
         */

    public static int numOfRegisteredStd = 0;
    public int num = 0;

    public Student()
    {
        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args)
    {
        Student s1 = new Student();
        System.out.println(numOfRegisteredStd);
        Student s2 = new Student();
        System.out.println(numOfRegisteredStd);
        Student s3 = new Student();
        System.out.println(numOfRegisteredStd);
    }

}
