package javaders.day28interface;

public interface Animal
{

    void eat(); //bu method abstract ve public'tir.

    void drink();

    //interface'lerdeki tum variable'lar otomatik olarak "final"dir.
    //Bu yüzden inteface içindeki variable'ı oluşturduğunuzda mutlka
    //değer ataması yapmalısınız.
    //Bilindiği gibi "final variable"ların değerleri değiştirilemez.

    //interfacelerdeki tum variable'lar otomatik(default) olarak "public" dir.

    //interfacelerdeki tum variable lar otomatik(default) olarak static'tir.
    int age = 4;


}
