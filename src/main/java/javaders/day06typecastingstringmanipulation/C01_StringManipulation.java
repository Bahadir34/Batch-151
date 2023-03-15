package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation 
{
    public static void main(String[] args) 
    {
        String str1= "What a good day!";
        System.out.println("str1.toUpperCse() = " + str1.toUpperCase());
        System.out.println("str1.toLowerCase : " + str1.toLowerCase());
        System.out.println("str1.charAt(#index) : " + str1.charAt(0));
        System.out.println("str1.length() : " + str1.length());
        System.out.println("str1.substring() : " + str1.substring(0,4));
        System.out.println("str1.contains() : " + str1.contains("a"));
        System.out.println("str1.startsWith() : " + str1.startsWith("T"));
        System.out.println("str1.startsWith() : " + str1.startsWith("t",3));

    }
    
}
