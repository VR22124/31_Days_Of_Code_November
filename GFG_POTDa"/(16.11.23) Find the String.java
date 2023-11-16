/* Find the String

Given two integers N and K, the task is to find the string S of minimum length such that it contains all possible strings of size N as a substring. The characters of the string should be from integers ranging from 0 to K-1.  

Example 1:
Input:
N = 2, K = 2
Output: 
00110
Explanation: 
Allowed characters are from 0 to k-1 (i.e., 0 and 1).
There are 4 string possible of size N=2 
(i.e "00", "01","10","11")
"00110" contains all possible string as a 
substring. It also has the minimum length.

Example 2:
Input:
N = 2, K = 3
Output: 
0010211220
Explanation: 
Allowed characters are from 0 to k-1 (i.e., 0, 1 and 2).
There are total 9 strings possible
of size N, given output string has the minimum
length that contains all those strings as substring.  */


Solution: 


class Solution{
    public String findString(int n, int k){
       StringBuilder ans = new StringBuilder(), temp = new StringBuilder();
        Map<String, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) 
            ans.append('0');

        temp.append(ans);
        mp.put(temp.toString(), 1);
        dfs(temp, ans, mp, k);
        return ans.toString();
    }
    
     public void dfs(StringBuilder curr, StringBuilder ans, Map<String, Integer> mp, int k) 
     {
        StringBuilder temp;
        for (int i = k - 1; i >= 0; i--) 
        {
            temp = new StringBuilder(curr.substring(1)); // leave first ch and take rest n-1 ch
            //append next ch
            temp.append((char) (i + '0'));
            if (!mp.containsKey(temp.toString())) 
            {
                mp.put(temp.toString(), 1);
                ans.append((char) (i + '0'));
                dfs(temp, ans, mp, k);
                return;
            }
        }
    

    }
}