class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder(s);
        String a1 = sb.reverse().toString();
        return a1.equals(s);
    }
}