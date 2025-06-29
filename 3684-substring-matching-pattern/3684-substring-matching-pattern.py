import re
class Solution(object):
    def hasMatch(self, s, p):
        escaped_pattern = ""
        for char in p:
            if char == "*":
                escaped_pattern += ".*" 
            else:
                escaped_pattern += re.escape(char) 
        pattern_re = re.compile(escaped_pattern)
        return pattern_re.search(s) is not None
        