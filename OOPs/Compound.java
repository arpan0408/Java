public class Compound {
    public static void main(String[]args) {
        double p = 10000, t = 2, r = 5;
        double rate = 1+(r/100);
        double amount = p*(rate*rate);

        System.out.print("Compound Interest: "+(amount-p));
    }
}