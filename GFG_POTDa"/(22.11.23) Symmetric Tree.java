/* Symmetric Tree
Given a Binary Tree. Check whether it is Symmetric or not, i.e. whether the binary tree is a Mirror image of itself or not.

Example 1:
Input:
         5
       /   \
      1     1
     /       \
    2         2
Output: 
True
Explanation: 
Tree is mirror image of itself i.e. tree is symmetric

Example 2:
Input:
         5
       /   \
      10     10
     /  \     \
    20  20     30
Output: 
False */

Solution:

/*
class of the node of the tree is as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
// complete this function
// return true/false if the is Symmetric or not
class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
       
        if(root==null)
        {
            return true;
        }
        return helper(root.left,root.right);
    }
    public static  boolean helper(Node left1,Node right1)
    {
        if(left1==null&&right1==null)
        {
            return true;
        }
        if(left1==null||right1==null)
        {
            return false;
        }
        return (left1.data==right1.data)&&
        helper(left1.left,right1.right)&&
        helper(left1.right,right1.left);
    }
}