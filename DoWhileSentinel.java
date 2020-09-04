import java.util.Scanner;

public class DoWhileSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data;
        int sum = 0;

        do {
            System.out.println("Please enter a number, a 0 will end the program:");
            data = input.nextInt();

            sum += data;
        } while (data != 0);

        System.out.println("The sum is " + sum);
    }
}
