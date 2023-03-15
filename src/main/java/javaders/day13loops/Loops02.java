package javaders.day13loops;

public class Loops02
{

    /*
    Verilen stringdeki kucuk harflerı console a yazdırmayın.

    Password = "Pwd12?Ab"
     */

    public static void main(String[] args)
    {
        String pwd = "Pwd12?Ab";

        for (int i = 0; i < pwd.length();i++)
        {
            if(pwd.charAt(i) > 96 && pwd.charAt(i) < 123) //burada ASCII kodlar yerıne tek tırnak içinde karakterleri de yazabilirdik
            {
                continue; //Java için boşver demektir.
            }
            else
            {

                System.out.print(pwd.charAt(i));

            }
        }

        //"break" ile "continue" arasindaki fark nedir?
        //"break" switch'in disina cikmak icin ve loop'u kirmak icin kullanilir.
        //"continue" ise Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.
        //"continue" deyimi döngünün başına dallandırır programı. Kullanırken dikkat et.

        System.out.println();
        //Bir stringi tersten yazdiran kodu yaziniz.
        //Bir stringi ters ceviren kodu yaziniz.


        String str = "Merhaba benim Bahadır Ahmet Ulaş";
        String strNew = ""; // yeni bir data olusturacagimiz icin her zaman memory de yeni bir konteynir olustururuz.
        for (int i = str.length()-1 ; i >= 0 ; i--)
        {
            strNew += str.substring(i,i+1);
        }
        System.out.println(str);
        System.out.println(strNew);

        //Bir tam sayının rakamlarının toplamını hesaplayan kodu yazınız.
        //578 = 5 + 7 + 8 = 20
        int number = 578;
        int toplam = 0;

        for (;;)
        {
            if(number / 10 == 0)
            {
                toplam += (number % 10);
                break;
            }
            else
            {
                toplam += (number % 10);
                number /= 10;
            }
        }

        System.out.println("Result : " + toplam);

        //usttekı soru 2.yol
        int sum = 0;
        for (int i = 578; i>0 ; i /= 10)
        {
            sum += (i%10);
        }


    }

}
