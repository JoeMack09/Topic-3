import java.util.Scanner;

public class ComputingATriangle {
    public static void main(String[] args) {
        // Use the Math methods to solve many computational problems
        // Given three sides of a triangle, for example you can
        // compute the angles by using the following formulas
        // A = acos((a * a - b * b - c * c) / (-2 * b * c))
        // B = acos((b * b - a * a - c * c) / (-2 * a * c))
        // C = acos((c * c - b * b - a * a) / (-2 * a * b))

        Scanner input = new Scanner(System.in);

        // Prompt user to enter the points
        System.out.println("Please enter the three points ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Compute the three sides
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        // Compute the three angles
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        // Display the results
        System.out.println("The three angles are " +
                Math.round(A * 100) / 100.0 + " " +
                Math.round(B * 100) / 100.0 + " " +
                Math.round(C * 100) / 100.0 + " ");
    }
}
