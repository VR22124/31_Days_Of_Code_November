 /* 896. Monotonic Array

An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:
Input: nums = [1,2,2,3]
Output: true

Example 2:
Input: nums = [6,5,4,4]
Output: true */

Solution : 

class Solution {
    public boolean isMonotonic(int[] nums) 
    {
        boolean g=false;
        boolean l=false;
        for(int i=0;i<nums.length-1;i++)
        {
            int d=nums[i+1]-nums[i];
            if(d>0)
            {
                g=true;
            }
            else if(d<0)
            {
                l=true;
            }
            if(g && l)
            {
                return false;
            }

        }
        return true;
       
    }
}