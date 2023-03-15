package practices.invidualquestions;

import java.util.ArrayList;
import java.util.List;

public class Q62
{

    //Listedeki 7 ve 10 dışındaki her öğenin değerini 2 şer arttırınız.

    public static void main(String[] args)
    {

       List<Integer> numb = new ArrayList<>(List.of(12, 31, 7, 13, 10));
        int counter = 0;
        for(Integer w : numb)
        {
            if(!(w == 7 || w == 10))
            {
                numb.set(counter, numb.get(counter) + 2);
            }
            counter++;
        }

        System.out.println(numb);

    }

}
