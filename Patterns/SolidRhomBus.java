import java.util.*;

public class SolidRhomBus {
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of lines = ");
    int n = sc.nextInt();
    int count = n;

    for(int i=0; i<n; i++){

        for(int j=0; j<count; j++)
            System.out.print(" ");

        for(int j=0; j<n; j++)
            System.out.print("*");
        System.out.println();
        count--;
    }

    sc.close();
    }
}