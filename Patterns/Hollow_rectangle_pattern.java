/* HOLLOW RECTANGLE pattern

     * * * * *
     *       *  
     *       *  
     *       *
     * * * * *
*/
import java.util.Scanner;

public class Hollow_rectangle_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n = sc.nextInt();
        System.out.println("Hollow Rectangle Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*"); 
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
