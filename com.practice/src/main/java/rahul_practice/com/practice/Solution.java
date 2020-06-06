package rahul_practice.com.practice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



 class Result {

    /*
     * Complete the 'goodSegment' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY badNumbers
     *  2. INTEGER l
     *  3. INTEGER r
     */

    public static int goodSegment(List<Integer> badNumbers, int l, int r) {
    // Write your code here
        Collections.sort(badNumbers);
        int longestDiff = 0;
        int max =0;
        for(int i =0;i<badNumbers.size()-1;i++){
            if(badNumbers.get(i)>= l && badNumbers.get(i)<=r){
                longestDiff= badNumbers.get(i+1) - badNumbers.get(i);
            }
        }


        return longestDiff;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int badNumbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> badNumbers = new ArrayList<Integer>();

        for (int i = 0; i < badNumbersCount; i++) {
            int badNumbersItem = Integer.parseInt(bufferedReader.readLine().trim());
            badNumbers.add(badNumbersItem);
        }

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.goodSegment(badNumbers, l, r);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}