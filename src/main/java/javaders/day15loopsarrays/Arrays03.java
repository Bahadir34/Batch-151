package javaders.day15loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03
{
    public static void main(String[] args)
    {

        /*
        Kullanıcının coklu datayı bır array e yerkestırebılmesı ıcın gereken kodu yazınız.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter data number which will you enter : ");
        int dataNumber = input.nextInt();

        String[] datas = new String[dataNumber];

        for(int i = 0; i< dataNumber;i++)
        {
            System.out.print(i+1 + ". Data : ");
            datas[i] = input.next();
        }
        System.out.println(Arrays.toString(datas));

    }
}
