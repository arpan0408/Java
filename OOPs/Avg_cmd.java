public class Avg_cmd {
    public static void main(String[]args) {
        int total = 0;
        for(int i=0; i<args.length; i++)
            total += Integer.parseInt(args[i]);
        
        int avg = total/args.length; 

        if(avg > 80)
            System.out.println("Excellent");
        else if(avg > 60)
            System.out.println("Good");
        else if(avg > 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        
    }
}