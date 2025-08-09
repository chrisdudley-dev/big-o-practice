package loops;

public class WindowOfK {
    public static void main(String[] args) {
        int n = 10, k = 5;
        for (int i = 0; i < n; i+=k) {
            for (int j = i; j < i + k && j < n; j++) {
                System.out.println(j); // O(1)
            }
        }
    }
}
// Complexity: O(n) - inner loop bounded by constant k