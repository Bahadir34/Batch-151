package practices.questionbankapexquestions;

public class StringManipulations_Q010
{
    /*
    Type code to check if a String has just a single space character any position in the middle
    Example: For ‘Ali     Can’ your code should print false on the console
    For ‘ Ali Can    ’ your code should print false on the console
    For ‘     Ali Can ’ your code should print false on the console
    For ‘Ali Can’ your code should print true on the console
     */

    public static void main(String[] args)
    {
        String text = "Ali Can";

        boolean spacesAtBeginAndEnd = text.length() == text.trim().length();
        boolean isThereOtherSpace = !text.trim().substring(text.indexOf(' ')+1,text.trim().length()).contains(" ");
        boolean result = spacesAtBeginAndEnd && isThereOtherSpace;
        //System.out.println("Spaces at begin and end : " + spacesAtBeginAndEnd);
        //System.out.println("Is There Other Spaces Exept End and Begin : " + isThereOtherSpace);
        System.out.println("Is string suitable : " + result);


        /*
        Question Bank solution

        String s = "Tom Hanks";
        String trimmed = s.trim();
        String allExceptSpace = trimmed.replaceAll("\\s", "");
        Boolean isThereSingleSpaceInTheMiddle = trimmed.length() - allExceptSpace.length()==1;
        System.out.println("There is a space in the middle: " + isThereSingleSpaceInTheMiddle);

         */


    }
}
