/*
This question is asked by Facebook.

Given a string and the ability to delete at most one character, return whether or not it can form a palindrome.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

Ex: Given the following strings...

"abcba", return true
"foobof", return true (remove the first 'o', the second 'o', or 'b')
"abccab", return false

 */


public class D07_ValidPalindromWithRemoval
{

        public static void main(String[] args)
        {
            String a="abcba";
            System.out.println(ValidPalindromWithRemoval(a));
        }
        public static boolean ValidPalindromWithRemoval(String s)
        {

        return isPalindrome(s, 0, s.length() - 1, false);
        }

        public static boolean isPalindrome(final String s, int leftIndex, int rightIndex, final boolean isCharacterDeleted)
        {

        while(leftIndex < rightIndex){

            if(s.charAt(leftIndex) != s.charAt(rightIndex)){
                if(isCharacterDeleted)
                    return false;

                // isPalindrome(s, leftIndex + 1, rightIndex, true) for cases like "ececabbacec"
                // isPalindrome(s, leftIndex, rightIndex - 1, true) for cases like "abccbab"
                return isPalindrome(s, leftIndex + 1, rightIndex, true) || isPalindrome(s, leftIndex, rightIndex - 1, true);
            }

            leftIndex++;
            rightIndex--;

        }

        return true;
        }

}

// Time complexity : O(n)            Space complexity : O(1)