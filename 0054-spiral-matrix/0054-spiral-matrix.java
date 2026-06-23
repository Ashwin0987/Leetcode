class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l=new ArrayList<>();
        int rowst=0,colst=0,rowend=matrix.length-1,colend=matrix[0].length-1;
        while(rowst<=rowend&&colst<=colend){
            for(int i=colst;i<=colend;i++){
                l.add(matrix[rowst][i]);
            }rowst++;
            for(int i=rowst;i<=rowend;i++){
                l.add(matrix[i][colend]);
            }colend--;
            if(rowst<=rowend)
            for(int i=colend;i>=colst;i--){
                l.add(matrix[rowend][i]);
            }rowend--;
            if(colst<=colend)
            for(int i=rowend;i>=rowst;i--){
                l.add(matrix[i][colst]);
            }colst++;
        }return l;
    }
}