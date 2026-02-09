public class Ternary_cmd {
    public static void main(String[]args) {
        int total = 0;
        for(int i=0; i<args.length; i++)
            total += Integer.parseInt(args[i]);
        
        int avg = total/args.length;

        System.out.println((avg>70)?"Good":"Poor");
    }
}