/*
This question is asked by Microsoft.

Given an array of strings, return the longest common prefix that is shared amongst all strings.
Note: you may assume all strings only contain lowercase alphabetical characters.

Ex: Given the following arrays...

["colorado", "color", "cold"], return "col"
["a", "b", "c"], return ""
["spot", "spotty", "spotted"], return "spot"
 */


public class D06_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str={"colorado", "color", "cold"};
        String result=LongestCommonPrefix(str);
        System.out.println(result);
    }

     static String LongestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

}

// Time complexity : O(S)O(S)            Space complexity : O(1)O(1)