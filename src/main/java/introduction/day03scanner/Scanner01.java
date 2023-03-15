package introduction.day03scanner;

// javanin util kutuphanesinde scanner class import edildi demektir.
import java.util.Scanner;

public class Scanner01
{
    public static void main(String[] args)
    {

        // 1.adim scanner class dan bir obje olustur.
        Scanner input = new Scanner(System.in);

        //object ismini input yaptik cunku bu object kullanicidan alinan datayi benim kodlarimin icine koyacak.

        // 2.adim kullaniciya ne istedigimizie dair mesaj vericez.
        System.out.print("Yaşınızı Giriniz : ");

        //3.adim kullanicinin verdigi datayi memory ye yerlestirmis olduk.
        byte ageStudent = input.nextByte();

        System.out.println("Öğrenci Yaşı : " + ageStudent);

    }
}
