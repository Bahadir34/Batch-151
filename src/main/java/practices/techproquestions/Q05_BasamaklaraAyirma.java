package practices.techproquestions;

public class Q05_BasamaklaraAyirma
{
    public static void main(String[] args)
    {

        // 12345 sayısının rakamları toplamını bulunuz.

        int x = 12345;
        System.out.println("Result : " + ((12345 % 10) + ((12345/10) %10) + ((12345 / 100)%10) + ((12345 / 1000) % 10) + 12345 / 10000));

    }
}
