class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n>0)
        {
            int split = n%10;
            sum = sum + split;
            product = product * split;
            n = n/10;
        } 
        return product - sum;
    }
}