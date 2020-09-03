import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the year you would like to test: ");
        int year = input.nextInt();

        // Test to see if year is set
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }
}
