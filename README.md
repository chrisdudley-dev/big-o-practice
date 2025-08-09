| File                       | Complexity | Reason (1-liner)                                                |
|----------------------------|-----------:|-----------------------------------------------------------------|
| `loops/ForLinear.java`     |   **O(n)** | Single loop; one pass over n items.                             |
| `loops/NestedSquares.java` |  **O(n²)** | Inner loop runs n times for each of n iterations.               |
| `loops/WindowOfK.java`     |   **O(n)** | Inner work bounded by constant **k**; total steps scale with n. |
| `recursion/Factorial.java` |   **O(n)** | Recurrence `T(n)=T(n−1)+O(1)` → n calls.                        |
| `recursion/FibNaive.java`  |  **O(2ⁿ)** | Recurrence `T(n)=T(n−1)+T(n−2)+O(1)` → exponential growth.      |
