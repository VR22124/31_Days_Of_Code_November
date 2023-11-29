/* Euler circuit and Path

An Eulerian Path is a path in graph that visits every edge exactly once and it starts and ends up at different indexes. An Eulerian Circuit is an Eulerian Path which starts and ends on the same vertex. Given an undirected acyclic graph with V nodes, and E edges, with adjacency list adj, return 2 if the graph contains an eulerian circuit, else if the graph contains an eulerian path, return 1, otherwise, return 0.

Example 1:
Input: 
https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700537/Web/Other/c191d733-5295-4e4a-81b7-7a1de77ec269_1685086734.png
Output: 2
Explanation: 
Following is an eulerian circuit in the mentioned graph
1 -> 2 -> 0 -> 1

Example 2:
Input: 
https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700537/Web/Other/c5419f69-5051-4865-aabe-4898ff1c92f3_1685086735.png
Output: 1
Explanation: 
Following is an eulerian circuit in the mentioned graph
1 -> 0 -> 2 */

Solution :

class Solution {
public:
	int isEulerCircuit(int V, vector<int>adj[])
	{
	        int oddDegreeCount = 0;

    for (int i = 0; i < V; ++i) 
    {
        if (adj[i].size() % 2 != 0) 
        {
            oddDegreeCount++;
        }
    }

    if (oddDegreeCount == 0)
    {
        return 2; 
    } 
    else if (oddDegreeCount == 2)
    {
        return 1; 
    } 
    else 
    {
        return 0; 
    }

	}
};