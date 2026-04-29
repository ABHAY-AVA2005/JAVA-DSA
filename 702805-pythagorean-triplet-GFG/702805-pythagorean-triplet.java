import java.util.*;

class Solution {
    boolean pythagoreanTriplet(int[] arr) {

        int n = arr.length;
        HashSet<Long> set = new HashSet<>();

        for (int x : arr) {
            set.add(1L * x * x);
        }

        for (int i = 0; i < n; i++) {
            long a = 1L * arr[i] * arr[i];

            for (int j = i + 1; j < n; j++) {
                long b = 1L * arr[j] * arr[j];

                if (set.contains(a + b)) {
                    return true;
                }
            }
        }

        return false;
    }
}