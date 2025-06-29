class Solution(object):
    def plusOne(self, digits):
        a=int(''.join(map(str,digits)))
        a+=1
        a = [int(digit) for digit in str(a)]
        return a