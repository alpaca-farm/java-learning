/*
"Write a program that prints the numbers from 1 to 100. But for multiples of three print
“Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which
are multiples of both three and five print “FizzBuzz”."
 */


public class fizzbuzz {
    public static void main(String args[]) {
        int counter = 1;
        int num;
        String s = "";

        while (counter <= 100) {
            if ((counter % 3) == 0 || (counter % 5) == 0) {
                if ((counter % 3) == 0) {
                    s = "Fizz";
                }
                if ((counter % 5) == 0) {
                    s += "Buzz";
                }
                System.out.println(s);
                s = "";
            } else {
                System.out.println(counter);
            }
            counter++;

        }
    }
}