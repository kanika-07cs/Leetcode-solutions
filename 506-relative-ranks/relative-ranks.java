class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        Integer[] index=new Integer[n];
        for(int i=0;i<n;i++){
            index[i]=i;
        }
        Arrays.sort(index,(a,b)-> score[b]-score[a]);
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
            int org=index[i];
            if(i==0)
            ans[org]="Gold Medal";
            else if(i==1)
            ans[org]="Silver Medal";
            else if(i==2)
            ans[org]="Bronze Medal";
            else 
            ans[org]=String.valueOf(i+1);
        }
        return ans;
    }
}