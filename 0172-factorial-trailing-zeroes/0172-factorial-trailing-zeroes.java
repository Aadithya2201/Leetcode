class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int currpoweroffive = 5;
        while(n>=currpoweroffive){
            count += n/currpoweroffive;
            currpoweroffive *= 5;
        }
        return count;
    }
}