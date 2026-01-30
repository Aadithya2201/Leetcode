class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int a = 0;

        for(int num : nums){
            if(count==0){
                a=num;
            }
            count+=(num==a)? 1:-1;
        }
        return a;
    }
}