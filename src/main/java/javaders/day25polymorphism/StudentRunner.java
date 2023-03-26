package javaders.day25polymorphism;



public class StudentRunner
{

    public static void main(String[] args)
    {
        StudentClass s1 = new StudentClass();
        String ıd = s1.getStdId();
        System.out.println("ID  : " + ıd);
        System.out.println("GPA : " + s1.getGpa());
        s1.setGpa(3.99);
        System.out.println("New GPA : " + s1.getGpa());
    }

}
