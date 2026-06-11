class Solution {
    public int[] runningSum(int[] nums) {
        int l=1;
        while(l<nums.length){
            nums[l]=nums[l]+nums[l-1];
            l++;
        }return nums;
    }
}