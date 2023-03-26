package javaders.day27interface;

public class Honda implements Engine, Brake
{


    @Override
    public void start()
    {
        System.out.println("Start...");
    }

    @Override
    public void slow()
    {
        System.out.println("Be slow...");
    }

    @Override
    public void payment()
    {
        System.out.println("");

    }
}
