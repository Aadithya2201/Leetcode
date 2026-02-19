class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int i=0;
        HashSet<Integer> set = new HashSet<>();
        for(int f: friends){
            set.add(f);
        }
        int[] arr = new int[n];
        for(int f : order){
            if(set.contains(f)){
                arr[i]=f;
                i++;
            }
        }
        return arr;
    }
}