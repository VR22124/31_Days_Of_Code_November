/* Print Matrix in snake Pattern

Given a matrix of size N x N. Print the elements of the matrix in the snake like pattern depicted below.


Example 1:

Input:
N = 3 
matrix[][] = {{45, 48, 54},
             {21, 89, 87}
             {70, 78, 15}}
Output: 
45 48 54 87 89 21 70 78 15 
Explanation:
Matrix is as below:
45 48 54
21 89 87
70 78 15
Printing it in snake pattern will lead to 
the output as 45 48 54 87 89 21 70 78 15.


Example 2:

Input:
N = 2
matrix[][] = {{1, 2},
              {3, 4}}
Output: 
1 2 4 3
Explanation:
Matrix is as below:
1 2 
3 4
Printing it in snake pattern will 
give output as 1 2 4 3. */


Solution :

class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++)
        {
            if(i%2==0)
            {
               for(int j=0;j<matrix.length;j++)
                {
                    arr.add(matrix[i][j]);
                }
            }
                else
                {
                   for(int g=matrix.length-1;g>=0;g--)
                        {
                            arr.add(matrix[i][g]);
                        }
                    }
                }
                      return arr;
            }
}