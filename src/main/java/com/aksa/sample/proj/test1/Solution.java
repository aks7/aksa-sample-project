package com.aksa.sample.proj.test1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import com.aksa.sample.proj.test.Person;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	char[] ar1=a.toCharArray();
    	char[] ar2=b.toCharArray();
    	//Arrays.sort(ar1);
    	//Arrays.sort(ar2);
    	int[] count=new int[26];
    	for(char c:ar1) {
    		count[c-'a']++;
    	}
    	for(char c:ar2) {
    		count[c-'a']--;
    	}
    	int result=0;
    	for(int i:count) {
    		result+=Math.abs(i);
    	}
    	return result;

    }
	public static void put(Character p, TreeMap<Character, Integer> tm1) {
		tm1.put(p, tm1.get(p) == null ? 1 : tm1.get(p) + 1);
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
