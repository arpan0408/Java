import java.util.*;


public class Palindrome {
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of lines = ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++)
            System.out.print(" ");

        for(int j=1; j<=i; j++)
            System.out.print(i-j+1);
            
        for(int j=i-1; j>=1; j--)
            System.out.print(i-j+1);
        System.out.println();
    }

    sc.close();
    }
}