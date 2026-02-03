public class Palindrome {
    public static void main(String[]args) {
        int n = 12921;
        int tp = n, sum = 0;

        while(tp>0){
            sum = (sum*10)+(tp%10);
            tp /= 10;
        }

        if(sum == n)
            System.out.println(n+" is a Palindrome.");
        else
            System.out.println(n+" is not a Palindrome.");
    }
}