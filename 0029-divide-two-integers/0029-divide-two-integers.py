class Solution(object):
    def divide(self, dividend, divisor):
        imin,imax=-2**31,2**31-1
        sign=""
        if(dividend==imin and divisor==-1):
            return imax
        if(dividend<0 and divisor<0):
            sign='+'
        if(dividend<0 or divisor<0):
            sign='-'
        dividend,divisor=abs(dividend),abs(divisor)
        count=0
        while(dividend>divisor):
            dividend-=divisor
            count+=1
        if sign=='-':
            return -1*count
        else:
            return count

            