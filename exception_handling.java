import java.util.*;

public class exception_handling {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the values = ");
        int a = sc.nextInt(), b = sc.nextInt();

        try 
        {
            if(b==0)
            throw new ArithmeticException("B can't be zero!");
            System.out.println("Result = "+a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Program executed.");
        }
    }
}
