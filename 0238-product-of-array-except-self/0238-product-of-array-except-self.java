class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[]=new int[nums.length];
        a[0]=1;
        for(int i=1;i<nums.length;i++){
            a[i]=nums[i-1]*a[i-1];
        }
        int last=1;
        for(int i=nums.length-1;i>=0;i--){
            a[i]*=last;
            last*=nums[i];
        }return a;
    }
}