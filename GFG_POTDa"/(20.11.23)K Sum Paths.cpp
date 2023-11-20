/* K Sum Paths

Given a binary tree and an integer K. Find the number of paths in the tree which have their sum equal to K.
A path may start from any node and end at any node in the downward direction.
Since the answer may be very large, compute it modulo 109+7.

Example 1:

Input:      
Tree = 
          1                               
        /   \                          
       2     3
K = 3
Output: 
2
Explanation:
Path 1 : 1 + 2 = 3
Path 2 : only leaf node 3
Example 2:

Input: 
Tree = 
           1
        /     \
      3        -1
    /   \     /   \
   2     1   4     5                        
        /   / \     \                    
       1   1   2     6    
K = 5                    
Output: 
8
Explanation:
The following paths sum to K.  
3 2 
3 1 1 
1 3 1 
4 1 
1 -1 4 1 
-1 4 2 
5 
1 -1 5  */


Solution :

class Solution
{
    public:
    int total=0;
    const int  mod=1e9+7;
    void solve(Node *root,int k, int prefix, unordered_map<int,int> &ending)
    {
        if(!root)
        {
            return ;
        }
        prefix=prefix+root->data;
        total=total+ending[prefix-k]%mod;
        ending[prefix]++;
        solve(root->left,k,prefix,ending);
        solve(root->right,k,prefix,ending);
        ending[prefix]--;
    }
     int sumK(Node *root,int k)
    {
      unordered_map<int,int> ending;
      ending[0]=1;
      solve(root,k,0,ending);
      return total;
    }
};