import java.util.Scanner;

public class Triangle01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines = ");
            int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
             System.out.print(((j + i) % 2 == 0) ? "1" : "0");
            }
        System.out.println();
        }
        sc.close();
    }
}
