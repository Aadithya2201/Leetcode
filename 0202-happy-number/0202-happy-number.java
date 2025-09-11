class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>(); 
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=getnum(n);
        }
        return n==1;
    }
        public int getnum(int n){
            int result=0;
            while(n!=0){
                int digit = n%10;
                result += digit*digit;
                n=n/10;
            }
            return result;
        }
    
}