class Solution {
    public String greatestLetter(String s) {
        boolean[] low=new boolean[26];
        boolean[] up=new boolean[26];
        for (char ch:s.toCharArray()) {
            if(ch>='a'&&ch<='z')
            low[ch-'a']=true;
            else 
            up[ch-'A']=true;
        }
        for(int i=25;i>=0;i--) {
            if(low[i]&&up[i])
            return String.valueOf((char)(i+'A'));
        }
        return "";
    }
}