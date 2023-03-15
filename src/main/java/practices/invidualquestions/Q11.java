package practices.invidualquestions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q11
{

    //    ||This Part Should be in Main Method||
    //
    //     -Create an array of size 5, assign some random values from 0 to 10
    //     -(use random class and for loop to assign values)
    //
    //
    //    ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
    //
    //     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
    //     -2-Create a method that prints the sum of an array
    //     -3-Create a method that prints the max element of an array
    //
    //    P.S: Return type should be void because we are not returning anything just printing

    public static void main(String[] args)
    {
        Random rand = new Random();
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(11);
        }
        printArray(arr);

        sumOfArray(arr);
        maxValueOfArray(arr);
    }

    public static void printArray(int array[])
    {
        for (int u: array)
        {
            System.out.print(u + " ");
        }
        System.out.println();
    }

    public static void sumOfArray(int array[])
    {
        int sum = 0;

        for (int u : array)
        {
            sum += u;
        }
        System.out.println("Sum of elements in array : " + sum);
    }

    public static void maxValueOfArray(int array[])
    {
        int maxValue = array[0];

        for (int i = 1; i<array.length ; i++)
        {
            if(maxValue < array[i])
                maxValue = array[i];
        }

        System.out.println("Max value of array : " + maxValue);
    }
}
