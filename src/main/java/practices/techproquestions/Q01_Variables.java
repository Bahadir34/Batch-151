package practices.techproquestions;

public class Q01_Variables {
    public static void main(String[] args) {
        // Bir variable başlat.
        byte age = 24, yas;
        int number = 43;

        String name = "Bahadır", isim;
        System.out.println("name = " + name);

        System.out.println("Age : " + age);

        yas = age;

        System.out.println("Yas : " + yas);

        isim = name;

        System.out.println("His Name = " + name);

        int year = 2023, month = 2;
        System.out.println("month = " + month);
        System.out.println("year = " + year);

        //Bir variable deklere et : x
        //Bir variable başlat : y
        //Başka bir variable başlat : z
        //x değişkenini y değişkeni ile başlat
        //Variable'i güncelle
        //Değişkenleri yazdır

        double x; //variable deklere etmek demek bu şekilde olur
                  // assignment yapılmaz

        double y = 15.9;
        double z = 28;
        x = y;

        x = 15.3;

        System.out.println("x : " + x + "\ny : " + y + "\nz : " + z);


    }
}
