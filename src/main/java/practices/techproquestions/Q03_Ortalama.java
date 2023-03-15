package practices.techproquestions;

public class Q03_Ortalama
{
    public static void main(String[] args)
    {
         /*
   double num1 = 23.4;
   double num2 = 24.0;
   double num3 = 12;
   double num4 = 450.3;
   double num5 = 23000;

  Bu sayıların ortalamasını hesaplayan bir kod yazınız.
*/
        double num1 = 23.4 , num2 = 24.0 , num3 = 12 , num4 = 450.3 , num5 = 23000;

        double toplam = num1 + num2 + num3 + num4 + num5;
        System.out.println("Ortalama = " + (toplam / 5));
    }
}
