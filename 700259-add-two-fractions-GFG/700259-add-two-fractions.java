class GfG {
    void addFraction(int num1, int den1, int num2, int den2) {
        // 1. Calculate the raw numerator and denominator
        // Standard formula: (a/b) + (c/d) = (ad + bc) / (bd)
        int numx = (num1 * den2) + (num2 * den1);
        int denx = den1 * den2;
        
        // 2. Find the GCD of the RESULTING fraction
        int common = gcd(numx, denx);
        
        // 3. Divide both by the GCD to simplify to the lowest terms
        System.out.println((numx / common) + "/" + (denx / common));
    }
    
    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
