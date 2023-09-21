import java.util.*;
// import java.lang.*;


public class capital
{
    public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string = " );
    String str = sc.nextLine();
    char ch[] = str.toCharArray();
    ch[0] = Character.toUpperCase(ch[0]);
    ch[ch.length-1] = Character.toUpperCase(ch[ch.length-1]);

    for(int i=1;i<ch.length-1;i++)
    {
        if(ch[i]==' ')
        {
            ch[i-1] = Character.toUpperCase(ch[i-1]);
            ch[i+1] = Character.toUpperCase(ch[i+1]);
        }
    }
    str = String.valueOf(ch);
    System.out.println(str);

    sc.close();
}
}
