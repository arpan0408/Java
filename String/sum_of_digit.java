package String;
import java.util.*;


public class sum_of_digit
{
    public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string = " );
    String str = sc.nextLine();
    int sum = 0,num = 0;
    for(int i=0;i<str.length();i++)
    {
        char ch = str.charAt(i);
        if(Character.isDigit(ch))
        {
            if(num!=0)
            {
                num *= 10;
            }
            num += Character.getNumericValue(ch);
        }
        else
        {
            sum += num;
            num = 0;
        }
    }
    sum += num;
    System.out.println(sum);
    sc.close();
}
}
