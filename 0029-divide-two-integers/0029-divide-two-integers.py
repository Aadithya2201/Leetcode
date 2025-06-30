class Solution(object):
    def divide(self, dividend, divisor):
        imin,imax=-2**31,2**31 -1
        if ((dividend==imin) and (divisor==-1)):
            return imax
        if (dividend<0) == (divisor<0):
            sign=1
        else:
            sign=-1
        dividend,divisor=abs(dividend),abs(divisor)
        q=0
        for i in range(31,-1,-1):
            if ((divisor<<i)<=dividend):
                dividend-=(divisor<<i)
                q+=(1<<i)
        q*=sign
        return min(max(q,imin),imax)