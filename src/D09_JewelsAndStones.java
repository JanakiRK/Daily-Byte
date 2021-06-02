/*
This question is asked by Amazon.
Given a string representing your stones and another string representing a list of jewels, return the number of
stones that you have that are also jewels.

Ex: Given the following jewels and stones...

jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0
 */

import java.util.*;


public class D09_JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "Af", stones = "AaaddfFf";
        int result_set = JewelsAndStones_set_method(jewels, stones);
        int result_map = JewelsAndStones_map_method(jewels, stones);
        System.out.println(result_set);
        System.out.println(result_map);

    }

    private static int JewelsAndStones_set_method(String jewels, String stones)
    {
        HashSet<Character> jewel_count = new HashSet();
        for (char i : jewels.toCharArray())
            jewel_count.add(i);
        int count = 0;
        for (int j = 0; j < stones.length(); j++) {
            if (jewel_count.contains(stones.charAt(j)))
                count++;
        }
        return count;

    }
    // Time complexity : O(n)            Space complexity : O(n)

    private static int JewelsAndStones_map_method(String jewels, String stones) {
        HashMap<Character, Integer> jewel_count = new HashMap<>();
        for (char i : jewels.toCharArray())
            jewel_count.put(i, jewel_count.getOrDefault(i, 0) + 1);
        int count = 0;
        for (int j = 0; j < stones.length(); j++) {
            if (jewel_count.containsKey(stones.charAt(j)))
                count++;
        }
        return count;
    }
}
    // Time complexity : O(n)            Space complexity : O(n)