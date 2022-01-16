// https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int indx = -1;
        int lo = 0;
        int hi= nums.length-1;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(nums[mid]==target)
            {
                indx=mid;
                break;
            }
            else if(nums[mid]>target)
            {
                hi=mid-1;
            }
            else
            {
                lo=mid+1;
            }
        }
        
        if(indx==-1)
        {
            return lo;
        }
        else
        {
            return indx;
        }
    }
}
