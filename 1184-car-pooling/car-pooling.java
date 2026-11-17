class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr = new int[1001];
        for(int[] t:trips){
            arr[t[1]]+=t[0];
            arr[t[2]]-=t[0];
        }
        int passengers=0;
        for (int i=0;i<=1000;i++){
            passengers+=arr[i];
            if(passengers>capacity)
            return false;
        }
        return true;
    }
}