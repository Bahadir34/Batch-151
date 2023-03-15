package practices.questionbankapexquestions;

public class Loops_010
{

    /*
    Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
    isaretiyle yazdırmak için gereken kodu yazınız.
    Örnegin; 75.4238 ´ *4*2*3*8
     */

    public static void main(String[] args)
    {

        double number = 75.4238;
        String numberStr = String.valueOf(number);
        for(int i = numberStr.indexOf(".")+1; i<numberStr.length();i++)
        {
            System.out.print("*"+numberStr.substring(i,i+1));
        }
    }

}
