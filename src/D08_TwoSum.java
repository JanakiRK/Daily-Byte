/*
This question is asked by Google.

Given an array of integers, return whether or not two numbers sum to a given target, k.
Note: you may not sum a number with itself.

Ex: Given the following...

[1, 3, 8, 2], k = 10, return true (8 + 2)
[3, 9, 13, 7], k = 8, return false
[4, 2, 6, 5, 2], k = 4, return true (2 + 2)
 */


import java.util.Arrays;
import java.util.HashMap;

public class D08_TwoSum
{
    public static void main(String[] args) {
        int[] sum={2,3,5,7};
        int target=9;
        int[] result=TwoSum_Brute(sum,target);
        int[] result_op=TwoSum_Optimised(sum,target);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result_op));

    }

    private static int[] TwoSum_Brute(int[] sum, int target)
    {
        for(int i=0;i<sum.length;i++)
        {
            for(int j=i+1;j<sum.length;j++)
            {
                if(sum[i]+sum[j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{};
    }
    // Time complexity : O(n^2)            Space complexity : O(1)

    private static int[] TwoSum_Optimised(int[] sum, int target)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<sum.length;i++)
        {
            int tar=target-sum[i];
            if(map.containsKey(tar))
                return new int[]{map.get(tar),i };
            map.put(sum[i],i);
        }
        return new int[]{};
    }
    // Time complexity : O(n)            Space complexity : O(n)

}
