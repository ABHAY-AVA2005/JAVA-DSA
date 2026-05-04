class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n<2) return false;
        int count=0;
        for(int i=1;i*i<=n;i++)
        {
            if((n%i)==0) count++;
            if(count>1) return false;
        }
        return true;
        
    }
}