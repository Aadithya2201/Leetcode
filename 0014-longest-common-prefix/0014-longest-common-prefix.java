class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String first = strs[0];
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);

            for (String s : strs) {
                if (i >= s.length() || s.charAt(i) != c) {
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }

        return prefix.toString();
    }
}
