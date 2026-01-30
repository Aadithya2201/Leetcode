class Solution {
    public String defangIPaddr(String address) {
        StringBuilder s = new StringBuilder();
        int n = address.length();
        for(int i=0;i<n;i++){
            if(address.charAt(i)=='.'){
                s.append("[.]");
            }
            else{
                s.append(address.charAt(i));
            }
        }
        return s.toString();
    }
}