package javaders.day25polymorphism;

public class StudentClass
{

    public String name = "Tom Hanks";
    public int age = 23;

    // +Encapsulation nedir?
    // -Data saklamaktır. (Data hiding)

    // +Datayı nasıl saklarsın?
    // -Access modifier ı private yaparak.

    private String stdId = "AC202302T";
    private double gpa = 3.87;
    private boolean successfull = false;

    //encapsulation yaptığımız datayı istersen diğer class'lardan okuyabiliriz.
    //Nasıl okuruz? "get method" oluşturarak encapsilate edilmiş datanın değerini okuyabiliriz.
    //i)get methodları hep public olur.
    //ii)get methodun return type ı okuduğu variable'ın return type ı ile aynı olur.
    //iii)get method bir boolean variable için oluşturulmuşsa ismi "is" ile baslar.


    public String getStdId()
    {
        return stdId;
    }

    public double getGpa()
    {
        return gpa;
    }

    //Encapsulation yapılan variable'ın data type ı "boolean" ise
    //get method ismi "is" ile baslar.
    public boolean isSuccessfull()
    {
        return successfull;
    }



    //Encapsulation yaptığımız data'yı istersek diğer classlardan nasıl değiştirebiliriz.
    //Nasıl değiştirilebiliriz? "set method" oluşturarak Encapsulate edilen variable değiştirilir.
    //i)set methodlar hep public olur. set methodun return type ı hep void olur.
    //iii)set method parametre kullanır., parametrenin data type'ı variable ile aynı olur.
    //iv) set method kullanarak varolan object üzerinde değişiklikler yaparak o ebjecti sanki yeni bir objectmiş gibi kullanabiliriz.
    //get methodların diğer adı getteri set metodların diğer adı setter dır.
    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }
}
