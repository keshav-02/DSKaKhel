Write a function to find the longest common prefix string amongst an array of strings.

Input: strs = ["flower","flow","flight"]
Output: "fl"

--------------------------------------------------------------------------------------

class Solution {
    public String longestCommonPrefix(String[] strs) {

        int size = strs.length;
        Arrays.sort(strs);

        String a = strs[0];
        String b = strs[size-1];
        String ans = "";

        for(int i=0; i<a.length(); i++) {

            if(a.charAt(i) == b.charAt(i))
                ans += a.charAt(i);

            else
                break;
        }

        return ans;
    }
}