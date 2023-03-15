package javaders.day06typecastingstringmanipulation;

public class TypeCasting
{
    //short data tipinde variable oluşturup byte data tipine çeviren kodu yazınız



    public static void main(String[] args)
    {
        byte byteSayi = 54;
        int intSayi = byteSayi; //Autowiding işlemi

        short num = 510;
        byte numByte = (byte)num;

        System.out.println("numByte : " + numByte);
    
        int intSayi1 = 8880;
        short shortSayi = (short)intSayi1; //explicit Narrowing işlemi

        System.out.println("shortSayi = " + shortSayi);
    
    }

}
