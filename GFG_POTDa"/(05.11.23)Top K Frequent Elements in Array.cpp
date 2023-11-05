 /* Top K Frequent Elements in Array 

Given a non-empty array nums[] of integers of length N, find the top k elements which have the highest frequency in the array. If two numbers have same frequencies, then the larger number should be given more preference.

Example 1:
Input:
N = 6
nums = {1,1,1,2,2,3}
k = 2
Output: {1, 2}

Example 2:
Input:
N = 8
nums = {1,1,2,2,3,3,3,4}
k = 2
Output: {3, 2}
Explanation: Elements 1 and 2 have the
same frequency ie. 2. Therefore, in this
case, the answer includes the element 2
as 2 > 1. */

Solution : 

class Solution {
  public:
    vector<int> topK(vector<int>& nums, int k) 
    {
       unordered_map<int, int> vec;
        for (auto i : nums)
            ++vec[i];
        
        priority_queue<pair<int, int>> pq;
        
        for (auto itr : vec) {
            pq.push({itr.second, itr.first});
        }
        
        vector<int> out;
        while (!pq.empty() && k--) {
            out.push_back(pq.top().second);
            pq.pop();
        }
        
        return out;

    }
};
