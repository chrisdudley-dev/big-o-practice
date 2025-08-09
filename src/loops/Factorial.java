package loops;

public class Factorial {
    public static long calcFactorial(long n) {
        if (n <= 1) {
            return 1;
        }
        return n * calcFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println((calcFactorial(5)));
    }
}
// Complexity: O(n)