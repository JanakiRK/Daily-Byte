/*
This question is asked by Facebook.

Given two strings s and t return whether or not s is an anagram of t.
Note: An anagram is a word formed by reordering the letters of another word.

Ex: Given the following strings...

s = "cat", t = "tac", return true
s = "listen", t = "silent", return true
s = "program", t = "function", return false
 */


import java.util.*;

public class D10_ValidAnagram
{
    public static void main(String[] args) {
        String a="listen",b="silent";
        System.out.println(ValidAnagram_brute(a,b));
        System.out.println(ValidAnagram_optimised(a,b));
    }

    private static boolean ValidAnagram_brute(String a, String b)
    {
        char[] ac=a.toCharArray();
        char[] bc=b.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        return Arrays.equals(ac,bc);
    }
    // Time complexity : O(nlogn)            Space complexity : O(1)

    private static boolean ValidAnagram_optimised(String a, String b)
    {
        if(a.length()!=b.length())
            return false;
        int[] count=new int[26];
        for(int i=0;i<a.length();i++)
        {
            count[a.charAt(i)-'a']++;
            count[b.charAt(i)-'a']--;

        }
        for(int c:count)
            if(c!=0)
                return false;

        return true;
    }
    // Time complexity : O(n)
    // Space complexity : O(1); because the table's size stays constant no matter how large nn is.
}
