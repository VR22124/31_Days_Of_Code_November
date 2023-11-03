/* 35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.


Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1 */

Solution: 

 class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            arr.add(nums[i]);
        }
        arr.add(target);
        Collections.sort(arr);
        int k=arr.indexOf(target);
        return k;
    }
}