class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] low= new boolean[26];
        boolean[] up=new boolean[26];
        for (int i=0;i<word.length();i++) {
            char ch=word.charAt(i);
            if(ch>='a'&&ch<='z')
                low[ch-'a']=true;
            else
                up[ch-'A']=true;
        }
        int c=0;
        for (int i=0;i<26;i++) {
            if (low[i]&&up[i]) {
                c++;
            }
        }
        return c;
    }
}