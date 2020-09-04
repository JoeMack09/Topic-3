import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read initial data
        System.out.print("Enter a number, if the number is 0, the program" +
                " will terminate:");
        int data = input.nextInt();

        // Keep reading data until input is 0
        int sum = 0;

        // Begin while loop
        while (data != 0) {
            // If data is not 0 it is added to the variable of sum
            sum += data;

            // Read next input if required
            System.out.print("Enter a number, if the number is 0, the program" +
                    " will terminate:");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}
