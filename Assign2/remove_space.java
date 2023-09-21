import java.util.*;


public class remove_space
{
    public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string = " );
    String str = sc.nextLine();
    char ch[] = new char[str.length()];
    int n = 0;
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)!=' ')
        ch[n++] = str.charAt(i);
    }
    str = String.valueOf(ch);
    System.out.println(str);
    sc.close();
}
}
