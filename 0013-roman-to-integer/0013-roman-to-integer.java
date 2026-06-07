class Solution {
    static int rom(char c){
        if(c=='I')
        return 1;
        else if(c=='V')
        return 5;
        else if(c=='X')
        return 10;
        else if(c=='L')
        return 50;
        else if(c=='C')
        return 100;
        else if(c=='D')
        return 500;
        else if(c=='M')
        return 1000;

        return 0;
    }
    public int romanToInt(String s) {
        int b;
        char a[]=s.toCharArray();
        int l=0,r=1,sum=0;
        if(a.length==1)
        return rom(a[0]);
        while(r<a.length){
            if(rom(a[l])<rom(a[r])){
                b=rom(a[r])-rom(a[l]);
                l+=2;
                r+=2;
            }
            else{
            b=rom(a[l]);           
            r++;
            l++;
            }
            sum+=b;
            if(l<a.length&&r==a.length)
            sum+=rom(a[l]);
        }
        return sum;
    }
}