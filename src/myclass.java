import java.util.Scanner;
import java.util.Random;

public class myclass {
    public static void main(String args[]) {
        Random rand = new Random();
        int x;
        int y;
        char response='y';

        while (true) {
            if (response == 'y'|| response == 'Y')
            {
                y = rand.nextInt(10) + 1;
                System.out.println("guess a number between 1 and 10");
                Scanner in = new Scanner(System.in);
                while (!in.hasNextInt()) {
                    System.out.println("dude, that's not a number, try again.");
                    in.nextLine();
                }
                x = in.nextInt();
                System.out.println(x == y ? "you guess it right! random number was " + y : "better luck next time. random number was " + y);
                System.out.println("type \"y\" to play again");
                response =in.next().charAt(0);

            }
            else{
                System.out.println("see ya next time!");
                break;
            }
        }
    }
}
