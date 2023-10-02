package String;
import java.util.*;


public class remove_other
{
    public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string = " );
    String str = sc.nextLine();
    char ch[] = new char[str.length()];
    int cs = 0;
    for(int i=0;i<str.length();i++)
    {
        char c = str.charAt(i);
        if(Character.isAlphabetic(c))
            ch[cs++] = c;
    }
    str = String.valueOf(ch);
    System.out.println(str);
    sc.close();
}
}
