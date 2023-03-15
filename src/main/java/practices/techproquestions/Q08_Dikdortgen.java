package practices.techproquestions;

import java.util.Scanner;

public class Q08_Dikdortgen
{

    public static void main(String[] args)
    {

        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.print("Edge a : ");
        int aEdge = input.nextInt();

        System.out.print("Edge b : ");
        int bEdge = input.nextInt();

        System.out.println("Perimeter of Rectangle : " + (2*aEdge + 2*bEdge));

    }

}
