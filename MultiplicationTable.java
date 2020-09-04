public class MultiplicationTable {
    public static void main(String[] args) {

        // Display the table heading
        System.out.print("Multiplication Table");

        // Display the number title
        System.out.print("     \n    ");
        for (int j = 1; j <= 9; j++)
            System.out.print("   " + j);
        System.out.println("\n ---------------------------------------");

        // Table Body
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
