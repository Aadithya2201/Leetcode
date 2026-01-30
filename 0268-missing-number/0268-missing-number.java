class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = 0;
        int actual = (n*(n+1))/2;
        for(int num : nums){
            expected += num;
        }
        return actual-expected;
    }
}