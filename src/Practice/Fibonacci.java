package Practice;

public class Fibonacci {
    public static void main(String[] args) {
        for (int j = 1; j <= 10; j++) {
            fibonacci(j);
            System.out.println();
        }
    }

    private static void fibonacci(int integer) {

        int twoBefore = 0;
        int oneBefore = 1;
        for (int i = 1; i <= integer; i++) {
            if (i == 2) {
                twoBefore = 0;
                oneBefore = 1;
            }
            oneBefore = oneBefore + twoBefore;
            twoBefore = oneBefore - twoBefore;
            System.out.print(oneBefore + "    ");
        }
    }
}
