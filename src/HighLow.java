import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        randomNumber(1, 10);
    }


    public static void randomNumber(double min, double max) {
        Scanner scan = new Scanner(System.in);

        double number = Math.floor(Math.random() * max) + min;
        System.out.println("Guess a number between " + min + " and " + max);
        int guesses = 1;
        while (guesses <= 3) {

            double guess = scan.nextInt();
            System.out.println(guess);

                if (number > guess) {
                    System.out.println("HIGHER");
                    guesses ++;

                } else if (number < guess) {
                    System.out.println("LOWER");
                    guesses++;

                } else if (number == guess) {
                    System.out.println("GOOD GUESS");
                System.out.println("Random number is: " + number);
                    System.out.println("You guessed " +guesses + " times.");
                    break;
                }
            }

    }
}
