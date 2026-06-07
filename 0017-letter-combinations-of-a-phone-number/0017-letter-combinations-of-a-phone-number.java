class Solution {
    String[] phone={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    void ph(List<String> res,String digit,StringBuffer s,int i){
            if(s.length()==digit.length()){
                res.add(s.toString());
                return;
            }
            String letters=phone[digit.charAt(i)-'0'];
            for(char c:letters.toCharArray()){
                s.append(c);
                ph(res,digit,s,i+1);
                s.deleteCharAt(s.length()-1);
            }
    }
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        ph(res,digits,new StringBuffer(),0);
        return res;
    }
}