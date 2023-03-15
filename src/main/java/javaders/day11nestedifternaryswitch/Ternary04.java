package javaders.day11nestedifternaryswitch;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Ternary04
{

    /*

    Kullanıcıdan alınan sayı cift ise yarısını ekrana yazdırın,
    tek ise "Bu sayi ikiye bolunmez" yazdirin.

     */

    /*
    ternary' de true ve false durumları icin size verilen data tipleri farkli ise
    oluşturduğunuz container in data tipini Object yapın.
    Object javada bir classtır.
    Object javadaki bütün class ların "Parent" ıdır.Yani babasıdır.
    Object classın parent ı yoktur.
    Javada parent ı olmayan tek class object class dır.
     */

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an intger : ");
        int num = input.nextInt();

        Object result = num % 2 == 0 ? num/2 : "Bu sayi ikiye bolunmez";

        System.out.println(result);
    }

}
