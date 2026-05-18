class Solution {
    public int missingNumber(int[] nums) {
        int num=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            num+=nums[i];
        }
        return n*(n+1)/2 - num;
    }
}