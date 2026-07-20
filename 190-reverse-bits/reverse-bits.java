class Solution {
    public int reverseBits(int n)
    {
        int res=0; //declare my output variable
        for(int i=0; i<32; i++) //shifting all 32 bits
        {
            int lastBit = n&1; //getting only the last bit
            n>>=1; //using right shift, the last bit is sent to front bit
            res<<=1; //using left shift
            res |= lastBit;
        }
        return res; //my output
    }
}
