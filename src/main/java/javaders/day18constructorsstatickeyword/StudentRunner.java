package javaders.day18constructorsstatickeyword;

public class StudentRunner
{
    public static void main(String[] args)
    {
        //static olan "numOfRegisteredStd" variable'ını cagırmak ıcın sadece class ısmını
        //kullandık. object olusturmadık
        System.out.println(Student.numOfRegisteredStd);

        //static olmayan "num" variable ını cagırmak ıcın object olusturduk.
        Student s1 = new Student();
        System.out.println(s1.num);

        //static olan "numOfRegisteredStd" variable'ına object üzerinden de ulaşılabilir
        //bu tavsiye edilmez. yapmayınız.
        System.out.println(s1.numOfRegisteredStd);
    }
}
