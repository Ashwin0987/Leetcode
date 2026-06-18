class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,r=nums.length-1;
        while(m<=r){
            switch(nums[m]){
                case 0:swap(nums,l,m);
                    m++;
                    l++;
                    break;
                case 1:m++;
                       break;
                case 2:swap(nums,m,r);
                       r--;
                       break;
            }
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}