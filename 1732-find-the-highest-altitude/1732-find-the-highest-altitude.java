class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int highest = 0;
        for (int num : gain){
            altitude += num;
            if(altitude>highest){
                highest = altitude;
            }
        }
        return highest;
    }
}