import java.util.*;


public class FloydsTriangle {
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of lines = ");
    int n = sc.nextInt();
    int num=1;

    for(int i=0; i<=n; i++){
        for(int j=0; j<i; j++)
            System.out.print(" "+num++);
        System.out.println();
    }

    sc.close();
    }
}