package practices.questionbankapexquestions;

public class StringManipulations_Q002
{
    /*
    Create 3 String variables for people's names. Print the sum of the number of characters in
    all the 3 names except space characters.
    Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.
     */

    public static void main(String[] args)
    {
        String name1 = "Gülsüm Açan";
        String name2 = "Nazım Kaya";
        String name3 = "Minanur Açan";

        System.out.println(name1.replace(" ","").length() + name2.replace(" ", "").length() + name3.replace(" ", "").length());
    }
}
