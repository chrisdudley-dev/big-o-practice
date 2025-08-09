package loops;

public class NestedSquares {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + "," + j); // O(1)
            }

        }
    }
}
// Complexity: O(n^2) - two nested Loops