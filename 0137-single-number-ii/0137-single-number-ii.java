class Solution {
    public int singleNumber(int[] nums) {
        int fir=0;
        int sec=0;
        for(int i=0;i<nums.length;i++){
            fir=(fir^nums[i])&~sec;
            sec=(sec^nums[i])&~fir;
        }return fir;
    }
}