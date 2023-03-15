package practices.invidualquestions;

import java.util.List;

public class Q56
{

    /*
    
    Bir tamsayı listesindeki 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
    
     */

    public static void main(String[] args) 
    {

        List<Integer> liste = List.of(12,31,7,13,10);
        int num = 0;
        
        for (Integer w : liste)
        {
            if(w != 13)
            {
                num+=w;
            }
            else
            {
                break;
            }
        }

        System.out.println("num = " + num);
        
    }
    
}
