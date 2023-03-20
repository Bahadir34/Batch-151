package practices.invidualquestions;

public class StringManipulationExample
{
    public static void main(String[] args)
    {

        String name1 = "mehmet";
        String name2 = "ahmet";

        System.out.println("name1= " + name1);
        System.out.println("name2= " + name2);

        if(name1.length() % 2 == 0)
        {
            System.out.println(name1.substring(0,name1.length()/2) + name2 + name1.substring(name1.length()/2));
        }

        else
        {
            System.out.println("Name2 cannot be inserted in the name1");
        }
    }

}
