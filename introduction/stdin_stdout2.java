import java.util.Scanner;

public class Solution 
{
	Scanner scnr = new Scanner(System.in);
	int i = scnr.nextInt();
	double d = scnr.nextDouble();
	// Call nextLine to capture nextInt newline in queue
	scnr.nextLine();
	String s = scnr.nextLine();
	scnr.close();

	System.out.println("String: " + s);
	System.out.println("Double: " + d);
	System.out.println("Int: " + i);
}