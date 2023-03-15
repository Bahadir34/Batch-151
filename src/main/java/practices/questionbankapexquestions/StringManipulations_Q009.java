package practices.questionbankapexquestions;

public class StringManipulations_Q009
{
    /*
    Create a String variable and print all characters except the first character and the last
    character on the console in uppercases.
    Example:If the String is ‘Java’ you should print ‘AV’ on the console.
     */

    public static void main(String[] args)
    {

        String text = "Java";

        System.out.println("text = " + text);

        System.out.println(text.substring(1,text.length()-1).toUpperCase());

    }
}
