package practices.invidualquestions;

import java.util.List;

public class Q57 
{

    //Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
    
    public static void main(String[] args) 
    {

        List<Integer> liste = List.of(12,31,7,13,10);
        int multi = 1;
        
        for (Integer u : liste)
        {
            if(u % 2 == 0)
            {
                multi *= u;
            }
            else
            {
                continue;
            }
            
        }

        System.out.println("multi = " + multi);
        
    }
    
}
