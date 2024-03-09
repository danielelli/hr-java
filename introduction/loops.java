import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // store input
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        // loop through 10 times starting from 1
        for (int i = 1; i <= 10; i++)
        {
            // store the product of i * N
            int prod = i * N;
            // print the expression with the product to the console
            System.out.printf("%d x %d = %d%n", N, i, prod);
        }
    }
}