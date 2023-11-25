/* 204. Count Primes

Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:
Input: n = 0
Output: 0 */


Solution :

class Solution {
public:
    int countPrimes(int n) 
    {
        int limit=(n-2)/2;
        vector<bool> mark(limit+1,false);
        for(int i=1;i<=limit;i++)
        {
            for(int j=1;(i+j+2*i*j)<=limit;j++)
            {
                mark[i+j+2*i*j]=true;
            }
        }
        int count =0;
        if(n>2)
        {
            count=count+1;
        }
        for(int i=1;i<=limit;i++)
        {
            if(!mark[i])
            {
                count++;
            }
        }
        return count;
    }
};


