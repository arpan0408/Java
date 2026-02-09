public class Factorial_cmd {
    public static void main(String[]args) {
        int n = Integer.parseInt(args[0]);
        System.out.printf("Factorial of %d are",n);
        for(int i=2; i<=n; i++)
            if(n%i==0)
                System.out.print(" "+i);
    }
}