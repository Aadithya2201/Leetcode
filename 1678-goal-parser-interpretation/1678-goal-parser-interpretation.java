class Solution {
    public String interpret(String command) {
        StringBuilder s = new StringBuilder();
        return command.replace("()","o").replace("(al)","al");
    }
}