/* 240. Search a 2D Matrix II
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
 

Example 1:
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true

Example 2:
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false */

Solution :

class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
     {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=m-1;
        while(i<n&&j>=0)
        {
            if(matrix[i][j]==target)
            {
                return true ;
            }
            if(target<matrix[i][j])
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
}