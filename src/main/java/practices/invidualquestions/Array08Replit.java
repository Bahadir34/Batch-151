package practices.invidualquestions;

import java.sql.Array;
import java.util.Arrays;

public class Array08Replit
{

    /*
    Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

    Input1={1,2,3,4}

    Input2={5,6}

    Output={1,2,3,4,5,6}

     */

    public static void main(String[] args)
    {

        int num1[] = {1,2,3,4};
        int num2[] = {5,6};
        int newArray[] = addTwoArrayIntoNewArray(num1,num2);

        System.out.println(Arrays.toString(newArray));
    }

    public static int[] addTwoArrayIntoNewArray(int num1[] , int num2[])
    {
        int elementNumber = num1.length + num2.length;
        int newArray[] = new int[elementNumber];

        for (int i = 0 ; i < num1.length ; i++)
        {
            newArray[i] = num1[i];
        }

        for (int i = num1.length ; i < elementNumber ; i++)
        {
            newArray[i] = num2[i-num1.length];
        }

        return newArray;
    }

}
