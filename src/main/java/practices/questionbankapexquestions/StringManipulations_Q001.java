package practices.questionbankapexquestions;

public class StringManipulations_Q001
{
    /*
    Create a String variable for city names which have just a single word.
    Print the city name with the initial is in uppercase and all the other characters
    are in lower cases on the console.
    Example: mIAMI should be printed as Miami
    miami should be printed as Miami
    MIAMI should be printed as Miami
    mIaMi should be printed as Miami etc.
     */

    public static void main(String[] args)
    {
        String city = "lOndON";
        System.out.println("city = " + city);

        String newCity = city.trim().substring(0,1).toUpperCase() + city.trim().substring(1).toLowerCase();
        System.out.println("newCity = " + newCity);
    }
}
