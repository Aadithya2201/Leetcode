class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        nums=nums1+nums2
        nums=sorted(nums)
        if(len(nums)%2==0):
            return (nums[len(nums)//2 -1] + nums[len(nums)//2]) / 2.0
        else:
            return nums[len(nums)//2]
            

    

        