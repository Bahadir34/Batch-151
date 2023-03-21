package practices.invidualquestions;

import java.util.Scanner;

public class HangMan
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        StringBuilder film = new StringBuilder();
        film.append("JOKER");

        StringBuilder filmCopy = new StringBuilder(film);



        int counter = 1,tahmin_sayisi = 3;

        for(int i = 0; i < film.length() ; i++)
        {
            filmCopy.setCharAt(i,'_');
        }

        System.out.println(filmCopy);

        do
        {
            System.out.print(counter + ". tahmin : ");
            char ch1 = input.next().charAt(0);


            for(int i = 0 ; i < film.length(); i++)
            {
                if(film.toString().charAt(i) == ch1)
                {
                    filmCopy.setCharAt(i,ch1);
                }
            }

            System.out.println(filmCopy);
            counter++;
        }while(tahmin_sayisi > 0);


    }

}
