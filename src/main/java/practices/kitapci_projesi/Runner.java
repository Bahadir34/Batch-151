package practices.kitapci_projesi;

import java.util.Scanner;

import static practices.kitapci_projesi.Depo.*;


public class Runner
{

    /*
     * ==================== PROJE==============================
     * bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no olsun program
     * baslayinca menu isminde bir method calissin
     * 1-kitap ekle
     * 2-numara ile kitap goruntule
     * 3-bilgi ile kitap goruntule
     * 4-numara ile kitap sil
     * 5-tum kitaplari listele
     * 6-cikis
     ************************************
     * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
     * yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer
     * olmali yani bir list'te tutmamiz gerek
     * 2-kitap numarasi 1000'den
     * baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
     * count=1000; menu isminde bir method olusturmaliyim,
     * 3-kitap ekle diye bir
     * method olusturmliyim,bu method farkli bir classda
     * 4-kullanicidn kitap adi
     * yazar adi ve fiyat bilgileri istenmeli
     */

    static int kitapNo = 1000;
    static Scanner input = new Scanner(System.in);

    static int secim;

    public static void main(String[] args)
    {
        defaultKitapEkle();
        menu();
    }

    private static void defaultKitapEkle()
    {
        Kitap ktp_1 = new Kitap("Su" , kitapNo++ , "Ali Safi" , 25.50);
        Kitap ktp_2 = new Kitap("Ateş" , kitapNo++ , "Mehmet Topal" , 30.00);
        Kitap ktp_3 = new Kitap("Toprak" , kitapNo++ , "Ali Sunal" , 22.90);
        Kitap ktp_4 = new Kitap("Tahta" , kitapNo++ , "Muhammed Sezgin" , 27.90);

        kitapIsimList.add(ktp_1.getKitapIsmi());
        kitapIsimList.add(ktp_2.getKitapIsmi());
        kitapIsimList.add(ktp_3.getKitapIsmi());
        kitapIsimList.add(ktp_4.getKitapIsmi());

        yazarList.add(ktp_1.getYazar());
        yazarList.add(ktp_2.getYazar());
        yazarList.add(ktp_3.getYazar());
        yazarList.add(ktp_4.getYazar());

        fiyatList.add(ktp_1.getFiyat());
        fiyatList.add(ktp_2.getFiyat());
        fiyatList.add(ktp_3.getFiyat());
        fiyatList.add(ktp_4.getFiyat());

        kitapNoList.add(ktp_1.getKitapNo());
        kitapNoList.add(ktp_2.getKitapNo());
        kitapNoList.add(ktp_3.getKitapNo());
        kitapNoList.add(ktp_4.getKitapNo());
    }

    public static void menu()
    {

        System.out.println(kitapNoList);

        System.out.print("Kitap Evimize Hoşgeldiniz\n\n1-kitap ekle" +
                "\n2-numara ile kitap goruntule" +
                "\n3-bilgi ile kitap goruntule" +
                "\n4-numara ile kitap sil" +
                "\n5-tum kitaplari listele" +
                "\n6-cikis");

        int secim = input.nextInt();

        switch (secim)
        {
            case 1 :
                kitapEkle();
            case 2 :
                numaraKitapGoruntule();
            case 3 :
                bilgiKitapGoruntule();
            case 4 :
                numaraKitapSil();
            case 5 :
                kitaplariListele();
            case 6 :
                System.out.println("Hoşçakalın!");
                menu();
            default:
                
        }
    }
    
    static void kitapEkle()
    {
        Kitap ktp_1 = new Kitap();
        System.out.print("Kitap İsmi : ");
        ktp_1.setKitapIsmi(input.next());
        kitapIsimList.add(ktp_1.kitapIsmi);


        System.out.print("Yazar : ");
        ktp_1.setYazar(input.next());
        yazarList.add(ktp_1.yazar);


        System.out.print("Fiyat : ");
        ktp_1.setFiyat(input.nextDouble());
        fiyatList.add(ktp_1.fiyat);


        ktp_1.setKitapNo(kitapNo++);
        kitapNoList.add(ktp_1.kitapNo);
    }
    
    static void kitaplariListele()
    {
        for(int i = 0 ; i < kitapNoList.size() ; i++)
        {
            System.out.println("\n******************************************\n");

            System.out.println("No : " + kitapNoList.get(i));
            System.out.println("Kitap İsmi : " + kitapIsimList.get(i));
            System.out.println("Yazarı : " + yazarList.get(i));
            System.out.println("Fiyat : " + fiyatList.get(i));
        }
    }
    
    static void numaraKitapGoruntule()
    {

        System.out.print("Kitap No : ");
        Integer num = input.nextInt();

        System.out.println("\n******************************************\n");

        System.out.print("Kitap No : " + kitapNoList.get(kitapNoList.indexOf((Integer)num)));
        System.out.print("Kitap İsmi : " + kitapIsimList.get(kitapNoList.indexOf((Integer)num)));
        System.out.print("Yazar : " + yazarList.get(kitapNoList.indexOf((Integer)num)));
        System.out.print("Fiyat : " + fiyatList.get(kitapNoList.indexOf((Integer)num)));

    }
    
    static void bilgiKitapGoruntule()
    {
        
    }
    
    static void numaraKitapSil()
    {
        System.out.print("Kitap No : ");
        Integer num = input.nextInt();

        kitapNoList.remove(num);
        kitapIsimList.remove(kitapNoList.indexOf((Integer)num));
        yazarList.remove(kitapNoList.indexOf((Integer)num));
        fiyatList.remove(kitapNoList.indexOf((Integer)num));
    }
}
