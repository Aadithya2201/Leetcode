class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int consume = 0;
        int empty = 0;
        while(numBottles>0){
            consume+=numBottles;
            empty+=numBottles;

            numBottles = empty/numExchange;
            empty = empty%numExchange;

        }
        return consume;
    }
}