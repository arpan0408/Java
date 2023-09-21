import java.util.*;


public class palindrome
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value = ");
    String str = s.nextLine();
    int i,n=str.length();
    for(i=0;i<n/2;i++)
    {
        if(str.charAt(i)!=str.charAt(n-1-i))
        {
            System.out.print("Not a palindrome string.");
            break;
        }
    }
    if(i==n/2)
    System.out.print("Palindrome.");
    s.close();
}
}
