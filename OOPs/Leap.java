public class Leap {
    public static void main(String[]args) {
        int year = 2026;

        if((year%400==0)||(year%4==0)&&(year%100!=0))
            System.out.println(year+" is a Leap year.");
        else
            System.out.println(year+" is not a Leap year.");
    }
}