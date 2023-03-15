package practices.questionbankapexquestions;

public class Arrays_Q004
{

    /*

    String'lerden oluşan bir arrayde öğeler 'n' veya 'k' ile
    bitiyorsa, o öğelerin baş harflerini
    alınız.

     */

    public static void main(String[] args)
    {

        String array[] = {"Kemal" , "Jonathan" , "Mark" , "Jackson" , "Ali"};
        String initialsLetters = "";
        for (String u : array)
        {
            if(u.endsWith("n") || u.endsWith("k"))
                initialsLetters += u.substring(0,1);
        }
        System.out.println(initialsLetters);


    }

}
