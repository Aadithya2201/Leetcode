class Solution(object):
    def lengthOfLastWord(self, s):
        a=s.split()
        b=0
        for i in a:
            if i==a[-1]:
                b=len(i)
        return b
        