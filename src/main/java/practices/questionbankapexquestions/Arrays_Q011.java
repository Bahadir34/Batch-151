package practices.questionbankapexquestions;

import java.util.Arrays;

public class Arrays_Q011
{

    public static void main(String[] args)
    {

        long startTime = System.nanoTime();

        int numbers[] = {0 , 5 , 2 , 0 , 3};

        int counter = 0;

        for(int u : numbers)
        {
            if(u == 0)
                counter++;
        }

        for(int i = 0 ; i<counter;i++) {
            for (int j = 0; j < numbers.length; j++) {

                if (j == numbers.length - 1)
                    break;

                if (numbers[j] == 0) {
                    numbers[j] = numbers[j] + numbers[j + 1];
                    numbers[j + 1] = numbers[j] - numbers[j + 1];
                    numbers[j] = numbers[j] - numbers[j + 1];
                }
            }
        }
            System.out.println(Arrays.toString(numbers));

            long endTime = System.nanoTime();
            System.out.println("Time : " + (endTime-startTime));

            long startTime1 = System.nanoTime();

            Integer[] arr = new Integer[]{5, 0, 2, 0, 3};
            Integer[] brr = new Integer[arr.length];
            int firstIdx = 0;
            int lastIdx = arr.length-1;
            for(int a=0; a<arr.length; a++){
                if(arr[a]!=0){
                    brr[firstIdx] = arr[a];
                    firstIdx++;
                }else{
                    brr[lastIdx]=0;
                    lastIdx--;
                }
            }
            System.out.println(Arrays.toString(brr));

            long endTime1 = System.nanoTime();
            System.out.println("Suleyman Hoca Time : " + (endTime1-startTime1));

    }


}
