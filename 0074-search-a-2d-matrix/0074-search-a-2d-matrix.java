class Solution {
    static int findrow(int [][]mat,int tar){
        int l=0,r=mat.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mat[mid][0]<=tar&&tar<=mat[mid][mat[0].length-1])
            return mid;
            else if(mat[mid][0]<tar) l=mid+1;
            else r=mid-1;
        }return -1;
    }
    static boolean search(int row,int [][]mat,int tar){
        int l=0,r=mat[row].length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mat[row][mid]==tar) return true;
            else if(mat[row][mid]>tar) r=mid-1;
            else l=mid+1;
        }return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=findrow(matrix,target);
        if(row!=-1) return search(row,matrix,target);
        else return false;
    }
}