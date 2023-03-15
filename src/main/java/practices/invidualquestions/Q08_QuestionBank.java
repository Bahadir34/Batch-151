package practices.invidualquestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q08_QuestionBank
{

    public static void main(String[] args) 
    {

        int x = 6;
        int result = x > 3 ? x < 5 ? 11 : 9 : 8;

        System.out.println("result = " + result);

        //*******************************************

        int y = 1;
        int z = y+=5;
        System.out.println(z);

        //********************************************

        System.out.println();
        int i=1;
        do{
            if(i != 3)
            {
                System.out.print(i + " ");
            } else
            {
                //continue;
            }

            i++;
        }while(i<5);

        System.out.println();

        //***********************************************

        int a=1;
        do{
            if(a == 3)
            {
                //continue;
            } else if(a == 5)
            {
                System.out.print(a + " ");
                break;
            } else
            {
                System.out.print(a + " ");
            }
            a++;
        }while(true);

        //****************************************************************************
    }
}
