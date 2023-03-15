package practices.invidualquestions;

public class Q09_TekCiftSorusu
{

    public static void main(String[] args)
    {

        printPrime(35);

    }

    private static boolean isPrime(int number) {
        if (number <= 0) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
