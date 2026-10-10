class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        long k=(long)k1+k2;
        int[] d=new int[100001];
        long total=0;
        for(int i=0;i<n;i++){
            int x=Math.abs(nums1[i]-nums2[i]);
            d[x]++;
            total+=x;
        }
        if(k>=total)
        return 0;
        for(int i=100000;i>0 &&k>0;i--){
            int move=(int)Math.min(k,d[i]);
            d[i]-=move;
            d[i-1]+=move;
            k-=move;
        }
        long ans=0;
        for(int i=0;i<=100000;i++){
            ans+=(long)i*i*d[i];
        }
        return ans;
    }
}