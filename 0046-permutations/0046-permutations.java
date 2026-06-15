class Solution {
    public List<List<Integer>> l=new ArrayList<>();
    public List<Integer> ll=new ArrayList<>();
    public void perm(int a[],boolean del[]){
        if(ll.size()==a.length){
        l.add(new ArrayList<>(ll));
        return;
        }
        for(int i=0;i<a.length;i++){
            if(del[i])
            continue;
            del[i]=true;
            ll.add(a[i]);
            perm(a,del);
            ll.remove(ll.size()-1);
            del[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {        
        perm(nums,new boolean[nums.length]);
        return l;
    }
}