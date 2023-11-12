Check if string is rotated by two places

Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating (in any direction) string 'a' by exactly 2 places.

Example 1:
Input:
a = amazon
b = azonam
Output: 
1
Explanation: 
amazon can be rotated anti-clockwise by two places, which will make it as azonam.

Example 2:
Input:
a = geeksforgeeks
b = geeksgeeksfor
Output: 
0
Explanation: 
If we rotate geeksforgeeks by two place in any direction, we won't get geeksgeeksfor.

Solution:  

class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        ArrayList<Character> arr=new ArrayList<Character>();
        ArrayList<Character> arro=new ArrayList<Character>();
        ArrayList<Character> ar=new ArrayList<Character>();
        char a,b;
        int n=str1.length();
        
        for(int i=0;i<n;i++)
        {
            a=str1.charAt(i);
            b=str2.charAt(i);
            arr.add(a);
            arro.add(a);
            ar.add(b);
        }
        Collections.rotate(arr,2);
        Collections.rotate(arro,-2);
        if(arr.equals(ar)||arro.equals(ar))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}