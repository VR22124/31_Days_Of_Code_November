/* Reverse a Doubly Linked List

Given a doubly linked list of n elements. Your task is to reverse the doubly linked list in-place.

Example 1:
Input:
LinkedList: 3 <--> 4 <--> 5
Output: 5 4 3

Example 2:
Input:
LinkedList: 75 <--> 122 <--> 59 <--> 196
Output: 196 59 122 75 */

Solution:

public static Node reverseDLL(Node  head)
{
    if(head.next==null)
    {
        return head;
    }
    Node current =head;
    Node temp=null;
    while(current!=null)
    {
        temp=current.prev;
        current.prev=current.next;
        current.next=temp;
        current=current.prev;
    }
    return temp.prev;
}