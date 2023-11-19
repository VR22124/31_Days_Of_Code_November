/* Intersection of two sorted Linked lists

Given two linked lists sorted in increasing order, create a new linked list representing the intersection of the two linked lists. The new linked list should be made with without changing the original lists.

Note: The elements of the linked list are not necessarily distinct.

Example 1:
Input:
LinkedList1 = 1->2->3->4->6
LinkedList2 = 2->4->6->8
Output: 2 4 6
Explanation: For the given two
linked list, 2, 4 and 6 are the elements
in the intersection.

Example 2:
Input:
LinkedList1 = 10->20->40->50
LinkedList2 = 15->40
Output: 40 */

Solution :


class Solution
{
   public static Node findIntersection(Node t1, Node t2)
    {
        Node result=null;
        Node current=null;
        HashMap<Integer,Integer> set =new HashMap<>();
        while(t1!=null)
        {
            set.put(t1.data,set.getOrDefault(t1.data,0)+1);
            t1=t1.next;
        }
        while(t2!=null)
        {
            if(set.containsKey(t2.data)&&set.get(t2.data)>0)
            {
                set.put(t2.data,set.get(t2.data)-1);
            
            if(result==null)
            {
                result = new Node(t2.data);
                current =result;
            }
            else
            {
                current.next=new Node(t2.data);
                current=current.next;
            }
        }
        t2=t2.next;
        }
        return result;
    }
}

