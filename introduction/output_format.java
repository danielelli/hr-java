import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                // left-justify string 15 characters, give ints with < 3 digits leading zeros
                    System.out.printf("%-14s %03d%n", s1, x);
            }
            System.out.println("================================");

    }
}