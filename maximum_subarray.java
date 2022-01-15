/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.
*/
class maximum_subarray {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        
        int curr_sum =0;
        int sum =Integer.MIN_VALUE;
        
        for(int i=nums.length -1;i>=0;i--)
        {
            if(0>curr_sum)
            {
                curr_sum=0;
            }
        
            
                curr_sum+=nums[i];
                if(curr_sum>sum)
                {
                    sum=curr_sum;
                }
            
        }
        
        return sum;
        
       
    }
}