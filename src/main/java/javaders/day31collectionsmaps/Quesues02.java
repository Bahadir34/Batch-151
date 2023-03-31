package javaders.day31collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Quesues02
{

    /*
      PriorityQueue'de belirlenen oncelige gore siralama yapilir
     */

    public static void main(String[] args)
    {

        Queue<String> line = new PriorityQueue<>();
        line.add("Milk");
        line.add("Meat");
        line.add("Orange");
        line.add("Tomatoes");
        line.add("Egg");

        System.out.println("line = " + line);


        Deque<String> d = new LinkedList<>(); // double ended ==> iki uclu
        //Deque'daki add(), get(), peek(), poll() remove() methodlari
        // first-last seklinde iki uclu olarak bulunur

        d.add("Milk");
        d.add("Meat");
        d.add("Orange");
        d.add("Tomatoes");
        d.add("Egg");

    }

}
