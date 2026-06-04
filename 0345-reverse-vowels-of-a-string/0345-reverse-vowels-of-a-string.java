class Solution {
    static int vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='u'||ch=='i'||ch=='o'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        return 1;
        else
        return 0;
    }
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        char arr[]=s.toCharArray();
        while(l<=r){
            if(vowel(arr[l])==1&&vowel(arr[r])==1){
                 char c=arr[l];
                 arr[l]=arr[r];
                arr[r]=c;
                 l++;
                 r--;
            }
            else if(vowel(arr[l])==1&&vowel(arr[r])!=1)
            r--;
            else
            l++;
        }return new String(arr);
    }
}