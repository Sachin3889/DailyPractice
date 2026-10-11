package leetcodeProblems;

import java.util.HashMap;
import java.util.Scanner;

public class P_409_Longest_Palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(longestPalindrome(s));
    }

    /*

    Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
    Letters are case sensitive, for example, "Aa" is not considered a palindrome.

    Example 1:

    Input: s = "abccccdd"
    Output: 7
    Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
    Example 2:

    Input: s = "a"
    Output: 1
    Explanation: The longest palindrome that can be built is "a", whose length is 1.
     */

    private static int longestPalindrome(String s) {
        HashMap<Character, Integer> freMap = new HashMap<>();

        for( char ch : s.toCharArray()){
            freMap.put(ch, freMap.getOrDefault(ch,0) + 1);
        }

        int length = 0;
        boolean oddFound = false;

        for(int freq : freMap.values()){
            if(freq % 2 == 0){
                length += freq;
            } else{
                length += freq - 1;
                oddFound = true;
            }
        }

        if(oddFound){
            length += 1;
        }

        return length;
    }
}
