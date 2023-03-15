package javaders.day14loops;

import java.util.Scanner;

public class Loops04
{

    public static void main(String[] args)
    {
        //Kullanıcı user name ve password gırsın
        //3 kereden fazla yanlıs gırerse "Your account has blocked!" mesajı alsın
        //3 kereye kadar yanlıs gırerse "Invalid username or password. Try again!"
        //Dogru gırerse "Welcome to your account!" mesajı alsın.

        Scanner input = new Scanner(System.in);
        int counter = 0;

        String validUserName = "techpro123";
        String validPassWord = "Education12?";

        do {

            if(counter == 4)
            {
                System.out.print("Your account has blocked!");
                break;
            }

            System.out.print("Please enter your user name : ");
            String userName = input.next();

            System.out.print("Please enter your password : ");
            String passWord = input.next();

            counter++;

            if(userName.equals(validUserName) && passWord.equals(validPassWord))
            {
                System.out.print("Welcome to your account!");
                break;
            }
            else
            {
                System.out.print("Invalid username or password\n" + (3-counter) + " right left!\n");
            }

        }while (true);
    }

}
