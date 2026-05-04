class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> arr= new ArrayList<>();
        
        for(int i=1;i*i<=n;i++)
        {
            if((n%i)==0) {
                arr.add(i);
                
                //if quotient is distinct add it
                if(i!= n/i) arr.add(n/i);
            }
            
        }
        Collections.sort(arr);
        return arr;
    }
}