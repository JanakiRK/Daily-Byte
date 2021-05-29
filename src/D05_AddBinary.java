/*
This question is asked by Apple.


Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string).
Note: neither binary string will contain leading 0s unless the string itself is 0

Ex: Given the following binary strings...

"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return  "1"

 */
public class D05_AddBinary
{
    public static void main(String[] args) {
        String a="100",b="1";
        String result=AddBinary(a,b);
        System.out.println(result);
    }

    private static String AddBinary(String a,String b)
    {
        int carry=0;
        //Create a stringBuilder to store all the values in the new added string which we have created
        StringBuilder sb=new StringBuilder();
        /*Assign two pointer both should start from the end of the string;Basically performing the
        Addition methodology*/
        int i=a.length()-1,j=b.length()-1;

        while(i>=0 || j>=0) {
            int sum=carry;
            if(i>=0) sum+=a.charAt(i)-'0';
            if(j>=0)  sum+=b.charAt(j)-'0';
            sb.append(sum%2);
            carry=sum/2;
            i--;
            j--;
        }
        if(carry>0)
            sb.insert(0,1);
        return sb.toString();
    }

    // Time complexity = O(m+n)           Space Complexity = O(ns)
}
