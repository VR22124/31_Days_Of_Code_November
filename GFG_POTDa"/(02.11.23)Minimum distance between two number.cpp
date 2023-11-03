/* Minimum distance between two numbers

You are given an array a, of n elements. Find the minimum index based distance between two distinct elements of the array, x and y. Return -1, if either x or y does not exist in the array.

Example 1:

Input:
N = 4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are
two distances between x and y, which are
1 and 3 out of which the least is 1.

Example 2:
Input:
N = 7
A[] = {86,39,90,67,84,66,62}
x = 42, y = 12
Output: -1
Explanation: x = 42 and y = 12. We return
-1 as x and y don't exist in the array. */

Solution:

class Solution{
  public:
    int minDist(int arr[], int n, int x, int y) {
        int min_dist = INT_MAX;
        int prev = -1; // To keep track of the previous index of x or y
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (prev != -1 && arr[i] != arr[prev]) {
                    min_dist = min(min_dist, i - prev);
                }
                prev = i;
            }
        }
        
        if (min_dist == INT_MAX) {
            return -1; // If one or both elements are not found in the array
        }
        
        return min_dist;
    }
    
};
