import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner age = new Scanner(System.in);
        int ageInt = 0;

        System.out.println("Enter your age here: ");
        ageInt = age.nextInt();
        age.nextLine();
        if(ageInt >= 21)
        {
            System.out.println("You are older than 21! You get a wristband! " );
        }











    }
}