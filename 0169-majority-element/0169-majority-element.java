class Solution {
    public int majorityElement(int[] nums) {
        int max=0;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i]))
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            else
            m.put(nums[i],1);
            max=Math.max(max,m.get(nums[i]));
        }for(Map.Entry<Integer,Integer>v:m.entrySet()){
            if(v.getValue().equals(max))
            return v.getKey();
        }return -1;
    }
}