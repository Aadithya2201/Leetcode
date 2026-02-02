class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String sub = s.substring(i, i + 10);

            if (!seen.add(sub)) {
                repeated.add(sub);
            }
        }

        result.addAll(repeated);
        return result;
    }
}
