public class LcmHcf {
    public static void main(String[]args) {
        int a = 9, b = 21;
        int tp_a = a, tp_b = b;

        while(tp_b > 0){
            int tp = tp_b;
            tp_b = tp_a%tp_b;
            tp_a = tp;
        }

        int gcd = tp_a;
        int lcm = (a*b)/gcd;

        System.out.println("GCD: "+gcd);
        System.out.println("HCF: "+gcd);
        System.out.println("LCM: "+lcm);

    }
}