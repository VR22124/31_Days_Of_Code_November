 /* Letters Collection

The Postmaster wants to write a program to answer the queries regarding letter collection in a city. A city is represented as a matrix mat of size n*m. Each cell represents a house and contains letters which are denoted by a number in the cell. The program should answer q queries which are of following types:
1 i j : To sum all the letters which are at a 1-hop distance from the cell (i,j) in any direction
2 i j : To sum all the letters which are at a 2-hop distance from the cell (i,j) in any direction 
The queries are given in a 2D matrix queries[][].
In one hop distance postmaster can go to any of [(i-1,j-1), (i-1,j), (i-1,j+1), (i,j-1), (i,j+1), (i+1,j-1), (i+1,j), (i+1,j+1)] from (i,j). 

Example 1:
Input: 
n = 4, m = 5
mat = {{1, 2, 3, 4, 10}, 
       {5, 6, 7, 8, 10}, 
       {9, 1, 3, 4, 10}, 
       {1, 2, 3, 4, 10}}
q = 2
queries = {{1 0 1}, 
           {2 0 1}}
Output: 
22 29
Explaination: 
For the first query sum is 1+5+6+7+3 = 22. 
For the second query sum is 9+1+3+4+8+4 = 29.

Example 2:
Input: 
n = 6, m = 6
mat = {{ 1,  2,  3,  4,  5,  6}, 
       { 7,  8,  9, 10, 11, 12}, 
       {13, 14, 15, 16, 17, 18}, 
       {19, 20, 21, 22, 23, 24},
       {25, 26, 27, 28, 29, 30},
       {31, 32, 33, 34, 35, 36}}
q = 1
queries = {{2 3 2}}
Output: 
336
Explaination: 
The first query sum is 7+8+9+10+11+17+23+29+35+34+33+32+31+25+19+13 = 336.  */

Solution :

class Solution{
    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][])
    {
        int x1[]={-1,-1,-1,0,0,1,1,1};
        int y1[]={-1,0,1,-1,1,-1,0,1};
        int x2[]={-2,-2,-2,-2,-2,-1,-1,0,0,1,1,2,2,2,2,2};
        int y2[]={-2,-1,0,1,2,-2,2,-2,2,-2,2,-2,-1,0,1,2};
        List<Integer> arr=new ArrayList<>();
        for(int x=0;x<q;x++)
        {
            int sum=0;
            int i=queries[x][1],j=queries[x][2];
            if(queries[x][0]==1)
            {
                for(int k=0;k<x1.length;k++)
                {
                    int n_x=i+x1[k];
                    int n_y=j+y1[k];
                    if(isSafe(n_x,n_y,n,m))
                    {
                        sum=sum+mat[n_x][n_y];
                    }
                    
                }
            }
            else
            {
                for(int k=0;k<x2.length;k++)
                {
                    int n_x=i+x2[k];
                    int n_y=j+y2[k];
                    if(isSafe(n_x,n_y,n,m))
                    {
                        sum=sum+mat[n_x][n_y];
                    }
                }
            }
            arr.add(sum);
        }
        return arr;
    }
    static boolean isSafe(int i,int j,int n,int m)
    {
        if(i>=0 &&i<n&&j>=0&&j<m)
        {
            return true;
        }
        return false;
    }
}