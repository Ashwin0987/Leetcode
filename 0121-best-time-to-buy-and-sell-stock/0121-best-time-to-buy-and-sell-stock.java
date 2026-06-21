class Solution {
    public int maxProfit(int[] prices) {
        int first=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(first>prices[i]){
            first=prices[i];
        }else{
            int profit=prices[i]-first;
            max=Math.max(max,profit);
        }
        }return max;

    }
}