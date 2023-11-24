 /* 3Sum Closest


Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

Example 2:
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0). */

Solution :

class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        int front;
        int sum=nums[0]+nums[1]+nums[2],sum1=0;
        for(int i=0;i<nums.size();i++){
            front=i+1;
            int back=nums.size()-1;
            while(front<back){
            sum1=nums[front]+nums[back]+nums[i];
            if(abs(sum1-target)<=abs(sum-target)){
                sum=sum1;
            }
            if(sum1>target) 
                back--;
            else if(sum1<target) 
               front++;
            else return sum1;
            }
        }
        return sum;
    }
};