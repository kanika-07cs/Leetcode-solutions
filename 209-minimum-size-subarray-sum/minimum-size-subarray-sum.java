class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        long[] prefix=new long[n+1];
        for (int i=0;i<n;i++) {
            prefix[i+1]=prefix[i]+nums[i];
        }
        int low=1,high=n,ans=0;
        while (low<=high) {
            int mid=low+(high-low)/2;
            boolean found=false;
            for (int i=0;i+mid<=n;i++) {
                long sum=prefix[i+mid]-prefix[i];
                if (sum>=target) {
                    found=true;
                    break;
                }
            }
            if(found){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
