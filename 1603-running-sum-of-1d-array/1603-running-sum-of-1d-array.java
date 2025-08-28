class Solution {
    public int[] runningSum(int[] nums) {
        int a = 0;
        int[] b = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            a+=nums[i];
            b[i]=a;
        }
        return b; 
    }
}