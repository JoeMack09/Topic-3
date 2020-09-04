public class FutureTuitionCost {
    public static void main(String[] args) {

        double tuition = 10000;
        int year = 0;


        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;
        }

        System.out.println("It will take " + year + " years for tuition to double.");
        System.out.printf("The tuition at that time will be $%.2f",
                tuition);
    }
}
