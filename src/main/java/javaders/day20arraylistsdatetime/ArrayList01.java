package javaders.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01
{

    /*

    1) String class kullanmak tercih edilir. Çünkü String Class method acisindan cok zengindir.
    2) List.of() kullanarak kısa yoldan List olusturabılırsınız ama
        * Bu listlerin elemanları değiştirilemez
        * Bu listeye eleman eklenemez
        * bu listlerden eleman silinemez.

     */

    public static void main(String[] args)
    {

        int counter = 0;

        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");

        Scanner input = new Scanner(System.in);

        do {



            if(counter == 5)
            {
                System.out.println(myList);
                break;

            }

            System.out.print("Please enter a letter : ");
            String letter = input.next().toUpperCase().substring(0,1);


            if(myList.contains(letter))
            {
                myList.set(myList.indexOf(letter) ,"Buldum");
            }
            else
            {
                myList.add(letter);
            }

            counter++;

        }while(true);
    }
}
