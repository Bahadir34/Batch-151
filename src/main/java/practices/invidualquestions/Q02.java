package practices.invidualquestions;

public class Q02
{
    /* TASK :
    Aşağıdaki şekilde çıktı veren programı print içerisinde
    sadece bir tane # kullanarak yazıdırınız

           #####
           #####
           #####
           #####
           #####

         */

    public static void main(String[] args)
    {
        for (int i = 0; i<5;i++)
        {
            for (int j = 0 ; j<5 ; j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
