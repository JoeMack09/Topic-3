public class FloatEpsilonExample {
    public static void main(String[] args) {

        final float EPSILON = 1e-7f;
        float x = 1.0f - 0.1f - 0.1f - 0.1f - 0.1f - 0.1f;
        if (Math.abs(x - 0.5f) < EPSILON)
            System.out.println(x + " is approximately 0.5");
    }
}
