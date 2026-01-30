class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> arr=new HashSet<>();
        for(int num : nums){
            if(!arr.add(num)){
                return true;
            }
        }
        return false;
    }
}