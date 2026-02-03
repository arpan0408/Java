public class fibonacci_sum {
    public static void main(String[]args) {
        int a = 0, b = 1, c, sum = 0;

        System.out.println("Fibonacci series: ");
        System.out.print(a+" "+b);
        for(int i=3; i<=25; i++){
            c = a+b;
            if(c%2==0)
                sum += c;
            System.out.print(" "+c);
            a = b;
            b = c;
        }

        System.out.println("\nSum = "+sum);
    }
}