class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
        for(String word : word1){
            s.append(word);
        }
        for(String word : word2){
            s1.append(word);
        }
        return s.toString().equals(s1.toString());
    }
}