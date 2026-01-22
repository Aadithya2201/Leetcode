class Solution {
    public void moveZeroes(int[] nums) {
        int pointwithnonzeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pointwithnonzeros]=nums[i];
                pointwithnonzeros++;
            }
        }
        for(int i=pointwithnonzeros; i<nums.length; i++){
            nums[i]=0;
        }
    }
}