package practices.invidualquestions;

public class Q05
{
    //        1 2 3 4 5 6
    //         2 3 4 5 6
    //          3 4 5 6
    //           4 5 6
    //            5 6
    //             6

    public static void main(String[] args)
    {
        int b = 1;
        for(int i = 1; i<7;i++)
        {
            int k = 1;
            while(k<i)
            {
                System.out.print(" ");
                k++;
            }

            for(int j = b ; j<7; j++)
            {
                System.out.print(j + " ");

            }
            b++;
            System.out.println();
        }

    }
}

/*

public class Q11 {

    //        1 2 3 4 5 6
    //         2 3 4 5 6
    //          3 4 5 6
    //           4 5 6
    //            5 6
    //             6

public static void main(String[] args) {

      for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 6; k++) {
                System.out.print(k + " ");

            }
            System.out.println();
        }

    }
}
 */