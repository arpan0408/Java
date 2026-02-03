public class Factorial {
    public static void main(String[]args) {
        int n = 21;
        System.out.print("Factorial of "+n+" are ");
        for(int i=2; i<n; i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
}