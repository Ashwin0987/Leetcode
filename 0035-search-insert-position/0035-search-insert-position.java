class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=1;
        if(target>nums[nums.length-1])
        return nums.length;
        while(l<r&&r<nums.length){
            if(nums[l]==target)
            return l;   
            else if(nums[r]==target)
            return r;         
        else if(nums[l]<target&&nums[r]>target){
        return l+1;
        } 
        r++;
        l++;
        }return 0;
    }
}