import java.util.*;


public class anagram
{
    public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string-1 = " );
    String str = sc.nextLine();
    System.out.print("Enter the string-2 = " );
    String str1 = sc.nextLine();
    if(str.length()!=str1.length())
    System.out.println("false");
    else
    {
        int i,j=0;
        for(i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            for(j=0;i<str1.length();j++)
            {
                if(ch==str1.charAt(j))
                    break;

            }
            if(j==str.length())
            {
                System.out.print("false");
                break;
            }            
        }
        if(i==str.length())
        System.out.print("True");
    }
    sc.close();
}
}
