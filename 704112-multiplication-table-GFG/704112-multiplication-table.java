// User function Template for Java
class Solution {
    static ArrayList<Integer> getTable(int n) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>(10);
        for(int i=1;i<=10;i++)
        {
            arr.add(n*(i));
        }
        
        return arr;
    }
}