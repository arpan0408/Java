public class Armstrong {
    public static void main(String[]args) {
        int n = 153;
        int tp = n, sum = 0;

        while(tp>0){
            sum += (tp%10)*(tp%10)*(tp%10);
            tp /= 10;
        }

        if(n==sum)
            System.out.println(n+" is an Armstrong.");
        else
            System.out.println(n+" is not an Armstrong.");
    }
}