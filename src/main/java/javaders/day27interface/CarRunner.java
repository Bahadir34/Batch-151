package javaders.day27interface;

public class CarRunner
{
    public static void main(String[] args)
    {
        Engine.stop(); //stop methodu static olduğundan interface ismi ile ulşatım.

        //Engine e = new Engine();
        Honda h = new Honda();
        h.eco(); //eco() methodu static olmadığından object ile ulaştım.

    }

}
