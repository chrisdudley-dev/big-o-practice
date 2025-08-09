package loops;

public class ForLinear {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(i); //O(1) work per iteration
        }
    }
}
//Complexity: O(n) - single loop