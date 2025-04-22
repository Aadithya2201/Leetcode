class Solution:
    def countPrimes(self, n: int) -> int:
        count=0
        if(n==0 or n==1):
            return 0
        sieve=[True]*n
        sieve[0]=sieve[1]=0
        i=2
        while i*i<n:
            if sieve[i]:
                for j in range(i*i,n,i):
                    sieve[j]=False
            i+=1
        return sum(sieve)
