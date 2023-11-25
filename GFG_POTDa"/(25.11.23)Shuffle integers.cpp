/* Shuffle integers

Given an array arr of n elements in the following format {a1, a2, a3, a4, ... , an/2, b1, b2, b3, b4, ... , bn/2}, the task is shuffle the array to {a1, b1, a2, b2, a3, b3, ... , an/2, bn/2} without using extra space.
Note that n is even.

Example 1:
Input: 
n = 4, arr = {1, 2, 9, 15}
Output:  
1 9 2 15
Explanation: 
a1=1, a2=2, b1=9, b2=15. So the final array will be: a1, b1, a2, b2 = {1,9,2,15}.

Example 2:
Input: 
n = 6 arr = {1, 2, 3, 4, 5, 6} 
Output: 
1 4 2 5 3 6 */


Solution :

	class Solution{
	public:
	void shuffleArray(int arr[], int n){
	    int m = n/2;
	    for(int i = 0; i < m; i++){
	        arr[i + m] += arr[i]*1001;
	    }
	    for(int i = 0; i < m; i++){
	        arr[2*i] = arr[i + m]/1001;
	        arr[2*i + 1] = arr[i + m]%1001;
	    }
	}
};