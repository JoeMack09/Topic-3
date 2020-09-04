

public class MaxNumberMethod {

    public static int max(int num1, int num2) {
        int maxNum = 0;
        if (num1 > num2)
            maxNum = num1;
        else if (num1 == num2)
            System.out.println("The numbers are equal" + num1 + " and " + num2);
        else
            maxNum = num2;

        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println("The maximum number between 90 and 99 is " + max(90, 99));

    }
}

