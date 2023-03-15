package javaders.day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01
{
    /*
    1) Bir array'in elemanları da array olursa bu tarz array'lere
       "Multidimensional Array" denir.
     */

    public static void main(String[] args)
    {
        //"Multidimensional Array" nasıl olurşturulur?
        String names[][] = new String[3][2];

        //"Multidimensional Array"e eleman nasıl eklenir?
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][0] = "P";
        names[1][1] = "M";
        names[2][0] = "C";
        names[2][1] = "Z";

        //Multidimensional Array'leri console a yazdırmak için
        //"toString()" methodu değil "deepToString()" methodu kullanılır."

        System.out.println(Arrays.deepToString(names));

        //Multidimensional Array icinden specific bir eleman nasıl yazdırılır?
        System.out.println(names[0][0]);

        //Multidimensional Array icindeki bir array nasıl yazdırılır?
        System.out.println(Arrays.toString(names[0]));
        System.out.println(Arrays.toString(names[1]));

        //Kisa yoldan Multidimensional Array nasil olusturulur?
        String students[][] = {{"Ali" , "Kemal"} , {"Cemal"} , {"Ayhan" , "Beyhan" , "Seyhan"} , {"Ceyhan" , "Kayahan"}};

        //*****************************************************************************************************************

        //Example 1 : Yukarıdaki students array inde toplam kac adet isim olduğunu bulunuz
        //1.way
        int counter = 0;
        for(String[] w : students)
        {
            for(String u : w)
            {
                counter++;
            }
        }

        counter = 0;
        //2.way
        for(String[] w : students)
        {
            counter += w.length;
        }
        System.out.println("Number of students names : " + counter);

        //*************************************************************

        //Example 2 : Yukarıdaki students arrayindeki icinde "m" harfı olan ısımlerı console ekranına yazdırınız.

        for(String[] w : students)
        {
            for (String u : w)
            {
                if(u.contains("m"))
                {
                    System.out.println("The name which contain character \'m\' : " + u);
                }
            }
        }

        //******************************************************************************

        //Example 3 : Bir integer multidimensional array olusturun. tum elemanların carpımını hesaplayın

        int nums[][] = { {5, 4}, {2, 3, 2}, {7}};
        int result = 1;
        for(int[] w : nums){
            for(int k : w){
                result = result*k;
            }
        }
        System.out.println(result);

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }

        //1.Step: Iki boyutlu array'de kac eleman oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi = 0;

        for(int[] w : numbers){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        //2.Step: Tek boyutlu array'i iki boyutlu array'in eleman sayisini kullanarak olusturmaliyiz
        int newArr[] = new int[toplamElemanSayisi];

        //3.Step: Iki boyutlu array'deki elemanlari tek boyutlu array'e transfer etmeliyim
        int idx = 0;


        for(int[] w : numbers){
            for(int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47

        int small = ages[0][0];
        int big = ages[0][0];
        // { {15, 4}, {12, 43, 21} }
        for(int[] w : ages){

            for(int k : w){
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println(small + big);
    }
}
