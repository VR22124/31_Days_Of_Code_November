/* 73. Set Matrix Zeroes

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]] */

Solution :

class Solution {
    public void setZeroes(int[][] matrix) 
    {
       int m=matrix.length; 
       int n=matrix[0].length;
       int ra[]=new int[m];
       int ca[]=new int[n];
       Arrays.fill(ra,1);
       Arrays.fill(ca,1);
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(matrix[i][j]==0)
               {
                   ra[i]=0;
                   ca[j]=0;
               }
           }
       }
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(ra[i]==0||ca[j]==0)
               {
                   matrix[i][j]=0;
               }
           }
       }
    }
}