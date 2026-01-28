class Solution {
    public int removeElement(int[] nums, int val) {
        int ii=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[ii]=nums[i];
                ii++;
            }
        }
        return ii;
    }
}