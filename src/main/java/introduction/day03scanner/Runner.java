package introduction.day03scanner;

public class Runner
{
    public static void main(String[] args)
    {
        // Object nasil olusturulur?
        // Class ismi + object ismi + atama operatörü + "new" + Constructor
        //sıfırdan bir object üretilecekse new keywordu kullanılır.


        Car               myCar              =            new      Car();
        Student myStudent = new Student();

        //myCar.model = "Auris";
        myCar.dur();

        System.out.println(myCar.price);
        System.out.println(myCar.model);
        myCar.hareket();

        myStudent.study();
        System.out.println(myStudent.address);
    }
}
