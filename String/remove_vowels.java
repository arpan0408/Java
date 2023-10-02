package String;
import java.util.*;


public class remove_vowels
{
    public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string = " );
    String str = sc.nextLine();
    char ch[] = new char[str.length()];
    int n = str.length(),cn=0;
    for(int i=0;i<n;i++)
    {
        if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u'
        &&str.charAt(i)!='A'&&str.charAt(i)!='E'&&str.charAt(i)!='I'&&str.charAt(i)!='O'&&str.charAt(i)!='U')
        {
            ch[cn] = str.charAt(i);
            cn++;
        }
    }

    String str1 = String.valueOf(ch);
    System.out.print(str1);
    sc.close();
}
}
