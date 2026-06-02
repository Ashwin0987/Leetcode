class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a[]=new int[256];
        int l=0,max=0;
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)]++;
            while(a[s.charAt(i)]>1){                
                a[s.charAt(l)]--;
                l++;
            }max=Math.max(max,i-l+1);
        }return max;                    
    }
}
