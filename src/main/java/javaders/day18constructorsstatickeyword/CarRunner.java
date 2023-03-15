package javaders.day18constructorsstatickeyword;

public class CarRunner
{
    public static void main(String[] args)
    {
        Car myCar1 = new Car();
        Car myCar2 = new Car("Mercedes", "C300",2023,50000);
        Car myCar3 = new Car("Audi" , "R8" , 2023 , 50000);
        Car myCar4 = new Car("BMW");

    }
}
