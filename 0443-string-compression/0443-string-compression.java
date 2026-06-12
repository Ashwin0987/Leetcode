class Solution {
    public int compress(char[] chars) {
        int l=0,index=0;
        while(l<chars.length){
            int count=0;
            char ch=chars[l];
            while(l<chars.length&&chars[l]==ch){
                l++;
                count++;
            }
            chars[index++]=ch;
            if(count>1)
            for(char c:String.valueOf(count).toCharArray())
                chars[index++]=c;
        }return index;
    }
}