/* Find Transition Point

Given a sorted array containing only 0s and 1s, find the transition point, i.e., the first index where 1 was observed, and before that, only 0 was observed.

Example 1:
Input:
N = 5
arr[] = {0,0,0,1,1}
Output: 3
Explanation: index 3 is the transition 
point where 1 begins.

Example 2:
Input:
N = 4
arr[] = {0,0,0,0}
Output: -1
Explanation: Since, there is no "1",
the answer is -1. */

Solution:

class Solution {
    int transitionPoint(int arr[], int n)
    {
        int zoo=0,r=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                 zoo=i;
                r=1;
                break;
            }
        }
        if(r!=1)
        {
            zoo=-1;
        }
        return zoo;
    }
}