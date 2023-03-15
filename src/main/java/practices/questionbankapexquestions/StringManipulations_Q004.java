package practices.questionbankapexquestions;

public class StringManipulations_Q004
{
    /*
    Create a String variable, print the number of non-digit characters in the String on the
    console.
    Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.
    */

    public static void main(String[] args)
    {

        String text = "1a3Bcf4!...";
        System.out.println("Number of non-digit characters : "+ (text.replaceAll("[0-9]","").length()));

    }
}
