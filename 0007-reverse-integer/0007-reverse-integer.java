class Solution {
    public int reverse(int x) {
        int t=x;
        x=Math.abs(x);
        int rev=0;
        while(x>0){
            int rem=x%10;
            x=x/10;
            if(rev>Integer.MAX_VALUE/10||rev<Integer.MIN_VALUE)
            return 0;
            rev=rev*10+rem;
        }
        if(t<0)
        return -rev;
        return rev;
    }
}