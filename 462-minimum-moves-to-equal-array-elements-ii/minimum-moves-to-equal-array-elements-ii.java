class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,moves=0;
        int med=nums[n/2];
        for(int i=0;i<n;i++){
            moves+=Math.abs(nums[i]-med);
        }
        return moves;
    }
}