/*
This question is asked by Amazon.

Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to
its original position. The string will only contain L, R, U, and D characters, representing left, right, up,
and down respectively.

Ex: Given the following strings...

"LR", return true
"URURD", return false
"RUULLDRD", return true
*/
public class D03_VacuumCleanerRoute {
    public static void main(String[] args) {
        String vacuum_route="LR";
        System.out.println(VacuumCleanerRoute(vacuum_route));
    }

    private static boolean VacuumCleanerRoute(String vacuum_route)
    {
        int ud=0,lr=0;
        for(char ch:vacuum_route.toCharArray())
        {
            if(ch=='U')
                ud++;
            else if (ch=='D')
                ud--;
            else if(ch=='L')
                lr++;
            else if (ch=='R')
                lr--;
        }
        return ud==0 && lr==0;
    }

}
//Time complexity = O(n)       Space Complexity = O(1)
