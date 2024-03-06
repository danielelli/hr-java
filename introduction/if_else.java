import java.util.*;
public class Solution
{
    private static final Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int N = scnr.nextInt();
        scnr.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scnr.close();

        // if n is odd, print "weird"
        if (N % 2 == 1) 
        {
            System.out.println("Weird");
        }

        // if n is even && inclusive between 2 to 5, print "not weird"
        if (N % 2 == 0 && N > 2 && N <= 5) 
        {
            System.out.println();
        }

        // if n is even && inclusive between 6 to 20, print "weird"
        if (N % 2 == 0 && N > 6 && N <= 20)
        {
            System.out.println("Weird");
        }

        // if n is even && greater than 20, print "not weird"
        if (N % 2 == 0 && N > 20)
        {
            System.out.println("Not Weird");
        }
    }
}