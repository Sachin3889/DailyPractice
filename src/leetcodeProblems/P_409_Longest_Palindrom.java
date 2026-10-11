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
