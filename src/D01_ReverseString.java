/*This question is asked by Google.

Given a string, reverse all of its characters and return the resulting string.

Ex: Given the following strings...

“Cat”, return “taC”
“The Daily Byte”, return "etyB yliaD ehT”
“civic”, return “civic”
*/


public class D01_ReverseString {
    public static void main(String[] args) {
        String str="The Daily Byte";
        String result_swap=ReverseString_swapping(str);
        String result_pointers=ReverseString_pointers(str);
        System.out.println(result_swap);
        System.out.println(result_pointers);
    }

    private static String ReverseString_pointers(String str)
    {
        char[] ch=str.toCharArray();
        int left=0, right=str.length()-1;
        while(left<=right)
        {
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);
    }
    //Time complexity = O(n)       Space Complexity = O(1)

    private static String ReverseString_swapping(String str)
    {
        char[] ch=str.toCharArray();
        int n=ch.length;
        for(int i=0;i<n/2;i++)
        {
            char temp=ch[i];
            ch[i]=ch[n-1-i];
            ch[n-i-1]=temp;
        }
        return new String(ch);
    }
}

//Time complexity = O(logn)       Space Complexity = O(1)
