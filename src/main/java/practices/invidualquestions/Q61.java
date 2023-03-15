package practices.invidualquestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q61 {
    //Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
    //Örnek : (12,31,15,13,54) ==> 12 ve 13 tür.

    public static void main(String[] args) {

    /*
    B!r tamsayı l!stes!nde en yakın 2 tamsayıyı bulunuz.
    Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

     */
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(31);
        nums.add(15);
        nums.add(13);
        nums.add(54);
        int fark = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (Math.abs(nums.get(j) - nums.get(i)) < fark) {
                    fark = Math.abs(nums.get(j) - nums.get(i));
                    num1 = nums.get(j);
                    num2 = nums.get(i);
                }
            }
        }
        System.out.println(num2 + " " + num1);
    }
}