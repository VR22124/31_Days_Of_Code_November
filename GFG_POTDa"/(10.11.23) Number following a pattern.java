/* Number following a pattern


Given a pattern containing only I's and D's. I for increasing and D for decreasing. Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can't repeat.

Example 1:
Input:
D
Output:
21
Explanation:
D is meant for decreasing, so we choose the minimum number among all possible numbers like 21,31,54,87,etc.

Example 2:
Input:
IIDDD
Output:
126543
Explanation:
Above example is self- explanatory,
1 < 2 < 6 > 5 > 4 > 3
  I - I - D - D - D  */

Solution:

class Solution{
    static String printMinNumberForPattern(String S)
    {
       int n = S.length();
        int cnt = 1;
        char[] ans = new char[n + 1];

        for (int i = 0; i <= n; i++) 
        {
            if (i==n || S.charAt(i) == 'I') 
            {
                for (int j = i - 1; j >= -1; j--)
                {
                    ans[j + 1] = (char)('0'+cnt);
                    cnt++;
                    if (j >= 0 && S.charAt(j) == 'I')  
                        break;
                }
            }
        }
       
        return new String(ans);
    }
}