class Solution {
    static int uniquepath(int r,int c,int tr,int tc,int dp[][]){
        if(r==tr-1&&c==tc-1) return 1;
        if(r>=tr||c>=tc) return 0;
        if(dp[r][c]>1) return dp[r][c];
        return dp[r][c]=uniquepath(r,c+1,tr,tc,dp)+uniquepath(r+1,c,tr,tc,dp);
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        Arrays.fill(dp[i],1);
        return uniquepath(0,0,m,n,dp);
    }
}