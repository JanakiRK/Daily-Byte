/*This question is asked by Google. Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, or only the first letter is capitalized.

Ex: Given the following strings...

"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true

 */

public class D04_CorrectCapitalization
{
    public static void main(String[] args) {
        String str="USA";
        System.out.println(correctCapitalization_ifselection(str));
        System.out.println(correctCapitalization_regex(str));
    }

    private static boolean correctCapitalization_ifselection(String str)
    {
        int n=str.length();
        if(n==1)
            return true;
        if(Character.isUpperCase(str.charAt(0))&& Character.isUpperCase(str.charAt(1)))
        {
            for(int i=2;i<n;i++)
                if(!Character.isUpperCase(str.charAt(i)))
                    return false;
        }
        else
        {
            for(int i=1;i<n;i++)
                if(Character.isUpperCase(str.charAt(i)))
                    return false;
        }
        return true;
    }

    //Time complexity = O(n)       Space Complexity = O(1)


    private static boolean correctCapitalization_regex(String str){
        return str.matches("[A-Z]*|[a-z]");
    }

    //Time complexity = O(n)       Space Complexity = O(1)

}
