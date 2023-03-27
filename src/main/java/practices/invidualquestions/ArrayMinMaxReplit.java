package practices.invidualquestions;

public class ArrayMinMaxReplit
{

    /*
    Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

    Input : {3,2,5,4,1,6}

    Output :

    min: 1

    max: 6
     */

    public static void main(String[] args)
    {

        int numbers[] = {3,2,5,4,1,6};
        minMaxCalculate(numbers);

    }

    public static void minMaxCalculate(int nums[])
    {
        int min = nums[0];
        int max = nums[0];

        for(int w : nums)
        {
            if(w > max)
                max = w;

            if(w < min)
                min = w;
        }

        System.out.println("min: " + min + "\nmax: " + max);
    }
}
