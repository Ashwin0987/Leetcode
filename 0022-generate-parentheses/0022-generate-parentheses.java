class Solution {
    public List<String> l=new ArrayList<>();
    void par(int oc,int cc,int n,String ans){
        if(ans.length()==n*2){
            l.add(ans);
            return;
        }
        if(oc<n)
        par(oc+1,cc,n,ans+"(");
        if(cc<oc)
        par(oc,cc+1,n,ans+")");
    }
    public List<String> generateParenthesis(int n) {
        par(0,0,n,"");
        return l;

    }
}