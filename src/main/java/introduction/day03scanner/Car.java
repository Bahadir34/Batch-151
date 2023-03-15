package introduction.day03scanner;

public class Car {
    // Variable lar olusturalim.

    public String model = "Corolla";
    public int price = 750000;

    // Note : return type void olduğunda method içinde return keywordu kullanılmaz.

    /*
       * eğer bir method yeni bir data üretmiyorsa sadece belli bir işlem yapıyorsa
         return typı void olur
    */
    public void hareket()
    {
        System.out.println("Corolla hizli hareket eder...");
    }

    public void dur()
    {
        System.out.println("Corolla güvenli bir şekilde durur...");
    }

}
