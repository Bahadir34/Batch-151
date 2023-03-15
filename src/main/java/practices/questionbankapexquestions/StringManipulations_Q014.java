package practices.questionbankapexquestions;

public class StringManipulations_Q014
{

    /*
    Type code to check if a String has a specific single character or not in three different ways.
     */

    public static void main(String[] args)
    {
        String s = "Java";

        //1.way
        Boolean result1 = s.contains("v");

        //2.way
        Boolean result2 = s.replace("^v","").length() > 0;

        //3.way
        Boolean resul3 = s.indexOf("v") != -1;
    }

}
