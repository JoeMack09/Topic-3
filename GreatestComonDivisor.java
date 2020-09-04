import java.util.Scanner;

class GreatestCommonDivisor {
    public static void main(String[] args) {

        // Establish the variables gcd and k
        int gcd = 1; // known gcd


        // Establish Scanner input
        Scanner input = new Scanner(System.in);

        //Establish n1 and n2
        System.out.println("Enter first integer:");
        int n1 = input.nextInt();

        System.out.println("Enter second number:");
        int n2 = input.nextInt();

        // Establish Loop can use a for or while loop. Have to establish k as a
        // a variable above for a while
        for (int k = 2; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }
        /*
        // Establish Loop to check for gcd
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // Update gcd
            k++;
        }
         */

        System.out.println("The greatest common deonominator of " + n1 +
                " and " + n2 + " is " + gcd);


    }
}
