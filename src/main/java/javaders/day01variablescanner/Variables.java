package javaders.day01variablescanner;

public class Variables
{
    public static void main(String[] args)
    {
        /*
        System.out.println("Byte : " + Byte.MIN_VALUE + " < x < " + Byte.MAX_VALUE);
        System.out.println("Short : " + Short.MIN_VALUE + " < x < " + Short.MAX_VALUE);
        System.out.println("Integer : " + Integer.MIN_VALUE + " < x < " + Integer.MAX_VALUE);
        System.out.println("Long : " + Long.MIN_VALUE + " < x < " + Long.MAX_VALUE);
        System.out.println("Float : " + Float.MIN_VALUE + " < x < " + Float.MAX_VALUE);
        System.out.println("Double : " + Double.MIN_VALUE + " < x < " + Double.MAX_VALUE);
*/
        String b = "Al! 12 ?_";
        System.out.println(b.replaceAll("\\d", "*"));
        System.out.println(b.replaceAll("\\D", "*"));
        System.out.println(b.replaceAll("\\S", "*"));
        System.out.println(b.replaceAll("\\w", "*"));
    }
}
