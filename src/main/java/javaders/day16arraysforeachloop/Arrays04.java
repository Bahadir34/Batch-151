package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04
{
    public static void main(String[] args)
    {

        /*
        Size verilen cümlede kaç kelime olduğunu gosteren kodu yazınız.
         */

        String s = "Java is easy. Learn Java earn money.";

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        //******************************************************

        //Size verilen cümlede kaç adet harf olduğunu bulun.

        String letter[] = s.replaceAll("[^a-zA-Z]" , "").split("");
        System.out.println(Arrays.toString(letter));
    }
}
