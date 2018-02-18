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
                System.out.println("give me your number");
                Scanner in = new Scanner(System.in);
                x = in.nextInt();
                if (x == y) {
                    System.out.println("you guess it right! random number was " + y);
                    System.out.println("type \"y\" to play again");
                    response =in.next().charAt(0);


                } else {
                    System.out.println("better luck next time! random number was " + y);
                    System.out.println("type \"y\" to play again");
                    response =in.next().charAt(0);

                }
            }
            else{
                System.out.println("see ya next time!");
                break;
            }
        }
    }
}
