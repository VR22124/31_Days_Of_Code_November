/* Binary Tree to CDLL
MediumAccuracy: 71.66%Submissions: 38K+Points: 4
Exclusively for Freshers! Participate for Free on 21st November & Fast-Track Your Resume to Top Tech Companies

banner
Given a Binary Tree of N edges. The task is to convert this to a Circular Doubly Linked List (CDLL) in-place. The left and right pointers in nodes are to be used as previous and next pointers respectively in CDLL. The order of nodes in CDLL must be same as Inorder of the given Binary Tree. The first node of Inorder traversal (left most node in BT) must be head node of the CDLL.

Example 1:
Input:
      1
    /   \
   3     2
Output:
3 1 2 
2 1 3
Explanation: After converting tree to CDLL
when CDLL is is traversed from head to
tail and then tail to head, elements
are displayed as in the output.


Example 2:
Input:
     10
   /    \
  20    30
 /  \
40  60
Output:
40 20 60 10 30 
30 10 60 20 40
Explanation:After converting tree to CDLL,
when CDLL is is traversed from head to
tail and then tail to head, elements
are displayed as in the output. */

Solution :

class Solution
{ 
    Node head=null, prev=null;

    Node bTreeToClist(Node root)
    {
        inorder(root);
    
    head.left=prev;
    prev.right=head;
    
    return head;
    
}
void inorder(Node curr)
{
    if(curr==null)
    
        return ;
    
    inorder(curr.left);
    if(head==null)
    {
        head=prev=curr;
        
    }
    else
    {
        prev.right=curr;
        curr.left=prev;
    }
    prev =curr;
    inorder(curr.right);
}
}