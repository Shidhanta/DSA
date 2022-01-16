//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
                int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        if(nums.length==1)
        {
            if(nums[0]==target) {
                ans[0]=0;
                ans[1]=0;
                return ans;
            }
            else
            {
                return ans;
            }
        }
        
      

        
        int lo=0;
        int hi =nums.length-1;
       
        
        while(lo<=hi)
        {
            int mid = (lo+hi)/2;
            if(nums[mid]==target)
            {   
                ans[0]=mid;
                int lo_mid=mid-1;
                while(lo_mid>=lo && lo_mid>-1)
                {
                    
                    if(nums[lo_mid]==target )
                    {   
                        ans[0]=lo_mid;
                        lo_mid--;
                    }
                    else
                    {   
                        break;
                    }
                }
                ans[1]=mid;
                int hi_mid=mid;
                while(hi_mid<=hi && hi_mid<nums.length)
                {
                    if(nums[hi_mid]==target)
                    {
                        ans[1]=hi_mid;
                        hi_mid++;
                    }
                    else
                    {
                        break;
                    }
                }
                
               break; 
            }
            
            else if(nums[mid]<target)
            {
                lo=mid+1;
            }
            else
            {
                hi=mid-1;
            }
        }
        return ans;
    }
}
