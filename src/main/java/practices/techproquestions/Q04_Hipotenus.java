package practices.techproquestions;

public class Q04_Hipotenus {


    public static void main(String[] args) {
        double a = 5, b = 4;

        System.out.println("Hipotenüs : " + calculateHipo(a, b));
    }

    public static double calculateHipo(double dikKenar1, double dikKenar2) {
        return Math.sqrt(dikKenar1 * dikKenar1 + dikKenar2 * dikKenar2);
    }

}

