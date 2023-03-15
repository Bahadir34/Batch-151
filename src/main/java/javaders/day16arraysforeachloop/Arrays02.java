package javaders.day16arraysforeachloop;

import java.util.Scanner;

public class Arrays02
{
    /*

    +, -, *, / ve mod alma islemlerini yapabilen hesap makinesi yaziniz.
    kullanici 'q' karakterine basmadigi surece islem devam etsin.


     */

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char opr;



        do
        {
            System.out.print("Please enter the operation among +, - , * , / , % : ");
            opr = input.next().toLowerCase().charAt(0);

            if (opr == 'q')
                break;

            else if(opr != '+' && opr != '-' && opr != '/' && opr != '*' && opr != '%' )
            {
                System.out.print("Undefined operation!");
                break;
            }
            System.out.print("Enter the first number : ");
            int n1 = input.nextInt();

            System.out.print("Enter the second number : ");
            int n2 = input.nextInt();

                switch (opr)
                {
                    case '+':
                        System.out.print(n1 + " + " + n2 + " = " + (n1+n2) + "\n");
                        break;

                    case '-':
                        System.out.print(n1 + " - " + n2 + " = " + (n1-n2) + "\n");
                        break;
                    case '*':
                        System.out.print(n1 + " x " + n2 + " = " + (n1*n2) + "\n");
                        break;
                    case '/':
                        System.out.print(n1 + " / " + n2 + " = " + (n1/n2) + "\n");
                        break;
                    case '%':
                        System.out.print(n1 + " % " + n2 + " = " + (n1*n2/100) + "\n");
                        break;
                }
        }while(true);
    }
}
