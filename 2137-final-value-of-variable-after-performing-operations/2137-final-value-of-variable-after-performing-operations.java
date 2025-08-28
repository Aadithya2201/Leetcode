class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a = 0;
        for (String op:operations)
        {
            if (op.equals("--X") || op.equals("X--"))
            {
                a-=1;
            }
            else
            {
                a+=1;
            }
        }
        return a;
    }
}