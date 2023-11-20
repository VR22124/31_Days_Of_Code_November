/* 34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1] */

Solution :


class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) 
    {
      vector<int>vec={-1,-1};
      int n=nums.size();
      int count=0;
      for(int i=0;i<n;i++)
      {
          if(nums[i]==target)
          {
              vec[0]=i;
              if(i==n-1)
              {
                  vec[1]=n-1;
                  
              }
              else
              {
                while(nums[i]==target && i<n-1)
                {
                    i++;
                }
                if(nums[n-1]==target)
                {
                    vec[1]=n-1;
                    break;
                }
                vec[1]=i-1;
              
              }
              break;
          }
      }
      return vec;
    }
};


