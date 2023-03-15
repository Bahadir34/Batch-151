package practices.invidualquestions;

import java.util.Arrays;

public class Q10_Karakter_Sayisi
{

        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */

    public static void main(String[] args) {

        String str="Javacilar cook afilli";
        String []arr=str.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        int count=1;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++)
        {
            count=1;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i].charAt(0)==arr[j].charAt(0))
                {
                    count++;
                }
                else
                {
                    i=j-1;
                    break;
                }
            }
            System.out.println(arr[i]+" = "+count);
        }
    }


}
