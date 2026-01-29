class Solution {
    public void reverseString(char[] s) {
        int a=s.length;
        for (int i=0;i<a/2;i++){
            char temp = s[i];
            s[i]=s[a-i-1];
            s[a-i-1]=temp;
        }
    }
}