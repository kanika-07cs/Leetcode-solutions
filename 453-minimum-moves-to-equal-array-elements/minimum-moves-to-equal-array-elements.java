class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        int sum=0,n=nums.length;
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            sum+=nums[i];
        }
        return sum-n*min;
    }
}