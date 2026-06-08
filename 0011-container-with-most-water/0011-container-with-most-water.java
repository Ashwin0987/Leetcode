class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,area=0,max=0;
       while(l<r){
        area=Math.min(height[l],height[r])*(r-l);
        max=Math.max(max,area);
        if(height[l]>height[r]) r--;
        else l++;
       }return max; 
    }
}