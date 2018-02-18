import java.util.Scanner;
import java.util.Random;

public class myclass {
    public static void main(String args[]) {
    Random rand = new Random();
    int y = rand.nextInt(10)+1;
    int x;
    System.out.println("give me your number");
    Scanner in = new Scanner (System.in);
    x = in.nextInt();
    if (x == y){
        System.out.println("you guess it right! random number was " + y);

    }
    else
    {
        System.out.println("better luck next time! random number was " + y);

    }
    }
}
