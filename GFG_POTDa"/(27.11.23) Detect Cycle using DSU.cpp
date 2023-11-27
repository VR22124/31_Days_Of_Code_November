/* Detect Cycle using DSU

Given an undirected graph with no self loops with V (from 0 to V-1) nodes and E edges, the task is to check if there is any cycle in the undirected graph.

Note: Solve the problem using disjoint set union (DSU).

Example 1:
Input: https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/701410/Web/Other/f496602b-dcfb-4de5-bdf6-0c51462af952_1685087018.png
Output: 1
Explanation: There is a cycle between 0->2->4->0

Example 2:
Input: https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/701410/Web/Other/ca19a9ca-7f9f-4c36-98cc-e678c1076ffd_1685087019.png
Output: 0
Explanation: The graph doesn't contain any cycle  */

SOlution :

class Solution
{
    public:
       int findparent(int vertex,vector<int>& parent)
       {
           if(vertex==parent[vertex ])
           {
               return vertex;
           }
               return parent[vertex]=findparent(parent[vertex],parent);
       }
	int detectCycle(int n, vector<int>adj[])
	{
	    vector<int> parent(n) , depth(n,1);
	    map<pair<int,int>, int>mp;
	    for(int i=0;i<n;i++)
	    {
	        parent[i]=i;
	    }
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<adj[i].size();j++)
	        {
	            int a=i;
	            int b=adj[i][j];
	            if(mp.find({a,b})!=mp.end() or mp.find({b,a})!=mp.end())
	            {
	                continue;
	            }
	            mp[{a,b}]=1;
	            int a_parent=findparent(a,parent);
	            int b_parent=findparent(b,parent);
	            if(a_parent!=b_parent)
	            {
	               if(depth[a_parent]>depth[b_parent])
	               {
                       parent[b_parent]=a_parent;
                       depth[a_parent]+=depth[b_parent];
	               }
	               else if(depth[a_parent]<depth[b_parent])
	               {
	                   parent[a_parent]=b_parent;
	                   depth[b_parent]+=depth[a_parent];
	               }
	               else
	               {
	                   parent[a_parent]=b_parent;
	                   depth[b_parent]+=depth[a_parent];
	               }
	            }
	            else
	            {
	                return 1;
	            }
	        }
	    }
	    return 0;
	}
};