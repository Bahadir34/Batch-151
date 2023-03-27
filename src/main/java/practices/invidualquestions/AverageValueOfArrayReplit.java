package practices.invidualquestions;

import java.util.List;

public class AverageValueOfArrayReplit
{

    /*
    Write a java program that calculates the average value of array elements

    input[]= {1,2,3,4,5,6,7}

    Output : 4
     */

    public static void main(String[] args)
    {

        List<Integer> numbers =List.of(1,2,3,4,5,6,7);

        Integer sum = 0;

        for(Integer w : numbers)
        {
            sum += w;
        }

        System.out.println("Result : " + sum/numbers.size());
    }
}
