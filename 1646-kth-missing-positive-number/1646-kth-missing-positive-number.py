class Solution(object):
    def findKthPositive(self, arr, k):
        a=[]
        i=1
        while(len(a)<k):
            if i not in arr:
                a.append(i)
            i+=1
        return a[k-1]