/* Pascal Triangle

Given a positive integer N, return the Nth row of pascal's triangle.
Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.
The elements can be large so return it modulo 109 + 7.

File:PascalTriangleAnimated2.gif

Example 1:

Input:
N = 4
Output: 
1 3 3 1
Explanation: 
4th row of pascal's triangle is 1 3 3 1.
Example 2:

Input:
N = 5
Output: 
1 4 6 4 1
Explanation: 
5th row of pascal's triangle is 1 4 6 4 1. */

Solution :

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList<Long> arr=new ArrayList<>(n);
         long mod=1000000007;
        for(int i=0;i<n;i++)
        {
            arr.add(0L);
        }
        arr.set(0,1L);
        for(int i=0;i<n-1;i++)
        {
            for(int j=n-1;j>=1;j--)
            {
                arr.set(j,(arr.get(j)+arr.get(j-1))%mod);
            }
        }
        return arr;
    }
}