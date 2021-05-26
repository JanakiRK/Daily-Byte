/*This question is asked by Facebook.

Given a string, return whether or not it forms a palindrome ignoring case
and non-alphabetical characters.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

Ex: Given the following strings...

"level", return true
"algorithm", return false
"A man, a plan, a canal: Panama.", return true
*/
public class D02_ValidPalindrom
{
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama.";
        System.out.println(ValidPalindrom(str));
    }

    private static boolean ValidPalindrom(String str)
    {
        //String stri=str.replaceAll("\\W","");
        String stri=str.replaceAll("[^a-zA-Z0-9]","");
        char[] ch=stri.toLowerCase().toCharArray();
        int n=ch.length;
        for(int i=0;i<n/2;i++)
        {
            if(ch[i]!=ch[n-i-1])
                return false;
        }
        return true;
    }
}

//Time complexity = O(n)       Space Complexity = O(1)
