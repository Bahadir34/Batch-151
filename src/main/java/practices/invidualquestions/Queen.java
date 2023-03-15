package practices.invidualquestions;

public class Queen
{

    public static void main(String[] args)
    {

        Queen queen = new Queen();

        queen.calculate(2,3,5,6);
    }

    public void calculate(int x1, int y1, int x2, int y2)
    {
        if(x1==x2)
            System.out.println("The queens can attack each other.");

        else if(y1==y2)
            System.out.println("The queens can attack each other.");

        else if(Math.abs(y1-y2) == Math.abs(x1-x2))
            System.out.println("The queens can attack each other.");

        else
            System.out.println("The queens can not attack each other.");
    }

}
