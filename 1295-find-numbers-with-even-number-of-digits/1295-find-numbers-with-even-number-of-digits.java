class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            int c=0;
            while(num!=0){
                int digit=num%10;
                num=num/10;
                c+=1;
            }
            if(c%2==0){
                count+=1;
            }
        }
        return count;
    }
}