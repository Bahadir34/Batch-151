package suleyman_hoca_videolari.stringmanipulations;

public class InterviewQuestion01
{
    public static void main(String[] args)
    {
        //Example : Type to swap the integers
        //      a = 12 and b = 5 => a = 5 and b = 12


        int a = 12,b = 5;

        System.out.println("a : " + a + "\nb : " + b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("\na : " + a + "\nb : " + b);
    }
}
