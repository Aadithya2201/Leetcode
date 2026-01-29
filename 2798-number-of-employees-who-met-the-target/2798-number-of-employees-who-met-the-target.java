class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hr : hours){
            if(target<=hr) count+=1;
        }
        return count;
    }
}