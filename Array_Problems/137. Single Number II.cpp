/* 137. Single Number II
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 
Example 1:
Input: nums = [2,2,3,2]
Output: 3

Example 2:
Input: nums = [0,1,0,1,0,1,99]
Output: 99 */

Solution :

class Solution {
public:
    int singleNumber(vector<int>& nums) 
    {
        int r=0;
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                r=nums[i];
            }
        }
        return r;
    }
};