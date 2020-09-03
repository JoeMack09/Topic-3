import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate Number between 0 and 100
        int num = (int)(Math.random() * 101);

        int guess = -1;

        // Generate While loop
        while (guess != num) {
            System.out.println("Guess a number between 0 and 100");
            guess = input.nextInt();

            if (guess == num)
                System.out.println("You are correct!");
            else if (guess > num)
                System.out.println("Your guess is to high! Guess again");
            else if (guess < num)
                System.out.println("Your guess is to low! Guess again");
        }

    }
}
