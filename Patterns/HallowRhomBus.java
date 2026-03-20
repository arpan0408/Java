import java.util.*;


public class HallowRhomBus {
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of lines = ");
    int n = sc.nextInt();
    int count = n;

    for(int i=1; i<=n; i++){
        for(int j=0; j<count; j++)
            System.out.print(" ");

        for(int j=1; j<=n; j++)
            System.out.print((i == 1 || j == 1 || i == n || j == n)?"*":" ");
        System.out.println();
        count--;
    }

    sc.close();
    }
}