(03.11.23) Pythagorean Triplet

/* Given an array arr of n integers, write a function that returns true if there is a triplet (a, b, c) from the array (where a, b, and c are on different indexes) that satisfies a2 + b2 = c2, otherwise return false.

Example 1:

Input:
N = 5
Arr[] = {3, 2, 4, 6, 5}
Output: Yes
Explanation: a=3, b=4, and c=5 forms a
pythagorean triplet.
Example 2:

Input:
N = 3
Arr[] = {3, 8, 5}
Output: No
Explanation: No such triplet possible */

Solution :

class Solution{
public:
	// Function to check if the
	// Pythagorean triplet exists or not
	bool checkTriplet(int arr[], int n) 
	{
	    unordered_set<int> squares;
    
    for (int i = 0; i < n; i++) {
        squares.insert(arr[i] * arr[i]);
    }
    
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (squares.find(arr[i] * arr[i] + arr[j] * arr[j]) != squares.end()) {
                return true;
            }
        }
    }
    
    
    return false;
	   
	}
};