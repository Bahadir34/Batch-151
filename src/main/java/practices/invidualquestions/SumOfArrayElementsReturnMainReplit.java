package practices.invidualquestions;

public class SumOfArrayElementsReturnMainReplit
{

    /*
    Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.


    Eg :

        input : {1,2,3,4,5,6,7,8};

        output: 36
     */

    public static void main(String[] args)
    {

        int nums[] = {1,2,3,4,5,6,7,8};

        System.out.println(sumOfArrayElements(nums));
    }

    public static int sumOfArrayElements(int numbers[])
    {
        int result = 0;

        for(int w : numbers)
        {
            result += w;
        }
        return result;
    }
}
