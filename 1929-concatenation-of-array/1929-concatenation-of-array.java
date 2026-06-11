class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]=new int[nums.length*2];
        for(int i=0;i<a.length;i++){
            if(i<nums.length) a[i]=nums[i];
            else a[i]=nums[i-nums.length];
        }return a;
    }
}