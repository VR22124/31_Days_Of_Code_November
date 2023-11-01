/* Frequencies of Limited Range Array Elements


banner
Given an array arr[] of N positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array. Your task is to count the frequency of all numbers from 1 to N. Make in-place changes in arr[], such that arr[i] = frequency(i). Assume 1-based indexing.
Note: The elements greater than N in the array can be ignored for counting and do modify the array in-place. 

Example 1:

Input:
N = 5
arr[] = {2, 3, 2, 3, 5}
P = 5
Output:
0 2 2 0 1
Explanation: 
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.
Example 2:

Input:
N = 4
arr[] = {3,3,3,3}
P = 3
Output:
0 0 4 0
Explanation: 
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 0 times.
3 occurring 4 times.
4 occurring 0 times. */

Solution :

class Solution{
    public:
    //Function to count the frequency of all elements from 1 to N in the array.
    void frequencyCount(vector<int>& arr,int N, int P)
    { 
        // code here
        vector<int> freq(N + 1, 0); // Initialize a frequency array with zeros

        for (int i = 0; i < N; i++) {
            if (arr[i] >= 1 && arr[i] <= N) {
                freq[arr[i]]++;
            }
        }

        for (int i = 1; i <= N; i++) {
            arr[i - 1] = freq[i];
        }
    }
};
