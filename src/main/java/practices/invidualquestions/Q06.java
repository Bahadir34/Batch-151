package practices.invidualquestions;

public class Q06
{
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
     */

    public static void main(String[] args)
    {
       for(int i = 1 ; i<6 ; i++)
       {
           for(int j = 7; j>i;j--)
           {
               System.out.print(" ");
           }

           for(int k = i; k>0; k--)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
