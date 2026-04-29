class Solution {
     // Method 3: Two Pointer
    // Start small a and large b
    static int pairCubeCount(int n) {

        int count = 0;

        int a = 1;
        int b = (int)Math.cbrt(n);

        while (a * a * a <= n && b >= 0) {

            int sum = a * a * a + b * b * b;

            if (sum == n) {
                count++;
                a++;
                b--;
            }
            else if (sum < n) {
                a++;     // need bigger sum
            }
            else {
                b--;     // need smaller sum
            }
        }

        return count;
    }
    
}
   
 /*  
    // Method 2: Better Method
    // Fix a, find b using cube root
    static int method2(int n) {

        int count = 0;

        for (int a = 1; a * a * a <= n; a++) {

            int rem = n - a * a * a;   // remaining value

            int b = (int)Math.round(Math.cbrt(rem));

            // If rem is perfect cube
            if (b >= 0 && b * b * b == rem) {
                count++;
            }
        }

        return count;
    }


     // Method 1: Brute Force
    // Try all possible a and b
     static int method1(int n) {

        int count = 0;

        for (int a = 1; a * a * a <= n; a++) {

            for (int b = 0; b * b * b <= n; b++) {

                // Check condition
                if (a * a * a + b * b * b == n) {
                    count++;
                }
            }
        }

        return count;
    }

   
}
*/