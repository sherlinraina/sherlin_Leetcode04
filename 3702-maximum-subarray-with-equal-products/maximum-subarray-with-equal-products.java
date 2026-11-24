import java.math.BigInteger;
class Solution {
    public int maxLength(int[] nums) {
        int maxLength = 0;
        for(int i=0; i<nums.length; i++){
            BigInteger product = BigInteger.ONE;
            int gcd = 0;
            int lcm = 1;
            for(int j=i; j<nums.length; j++){
                int num = nums[j];
                product = product.multiply(BigInteger.valueOf(num));
                gcd = findGcd(gcd, num);
                lcm = (lcm/findGcd(lcm, num))*num;
                if(product.equals(BigInteger.valueOf((long) gcd*lcm))){
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }
        return maxLength;
    }
    private int findGcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}