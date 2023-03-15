package javaders.day05typecastingasciivaluesstringmanipulations;

public class C02_AsciiValue
{
    public static void main(String[] args) {
        //'A' karakterinin Ascii degerini hesaplatan kodu yazın

        //Java'da char data type'ını matematiksel işlemlerde kullanırsanız
        //Ascii table'daki sayısal degerleri alır

        //Numeric data typeları : byte-short-int-long-float-double
        //char data type'ı hem resim barındırır hem de sayı barındırır
        //boolean true-false barındırır

        int asciiA='A';
        System.out.println(asciiA);

        int asciia = 'a';
        System.out.println("asciia = " + asciia);//asciia = 97

        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem);//asciiUnlem = 33
        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace);//asciiSpace = 32
        int asciiSembol = '*';
        System.out.println("asciiSembol = " + asciiSembol);//asciiSembol = 42

        int deger=20;
        char smbl= '$';

        System.out.println(deger+smbl);//56

        int deger2=0;
        char smbl2='+';
        System.out.println("deger2+smbl2 = "+ (deger2+smbl2));//43

        byte b =5;
        char ch2='h';

        System.out.println("b > ch2 = " +( b>ch2));

        int asciih='h';
        System.out.println("asciih = " + asciih);

        int ascii5='5';
        System.out.println("ascii5 = " + ascii5);

        asciih = 'h';
        System.out.println("asciih = " + asciih);//104
        ascii5 = '5';
        System.out.println("ascii5 = " + ascii5);//53

        System.out.println("b > ch2 = " +( b>ch2));//false  5>104 == false

        long l= 542168784578L;
        System.out.println("ch2>l : "+(ch2>l));//false

        float f =2.45648f;
        double d =2.19658;
        System.out.println("f>d : "+(f>d));//t
        byte sayi3=5;
        byte sayi4 =6;
        System.out.println("sayi3<sayi4 : "+(sayi3<sayi4));//true

        System.out.println("b<f : "+(b<f));//false t

        int sayiInt =100;
        long sayiLong =100L;
        System.out.println("sayiInt == sayiLong : "+(sayiInt == sayiLong));//true
        int sayiInt2 =200;
        System.out.println("sayiInt>=sayiLong : "+(sayiInt2 >= sayiLong));//true

        int sayiInt3=9;
        char sayiChar='9';
        System.out.println("sayiInt3 >=sayiChar "+(sayiInt3 >=sayiChar));// false


    }//main


}//Class