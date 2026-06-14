class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int res=0;
        int leftmax=height[l],rightmax=height[height.length-1];
        while(l<r){
            if(leftmax<=rightmax){
                l++;
                leftmax=Math.max(leftmax,height[l]);
                res+=leftmax-height[l];
            }
            else{
                r--;
                rightmax=Math.max(rightmax,height[r]);
                res+=rightmax-height[r];
            }
        }return res;
    }
}