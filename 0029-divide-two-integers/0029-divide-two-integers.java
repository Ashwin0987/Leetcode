class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
        return Integer.MAX_VALUE;
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        if((dividend<0)^(divisor<0))
        return (int)(-(a/b));
        else 
        return (int)(a/b);
    }
}