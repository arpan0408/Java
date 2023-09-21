import java.util.*;


public class vowels_constants_space
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the string = ");
    String str = s.nextLine();
    int c=0, v=0, sp=0;

    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)=='A'||str.charAt(i)=='a')
            v++;
        else if(str.charAt(i)=='E'||str.charAt(i)=='e')
            v++;
        else if(str.charAt(i)=='I'||str.charAt(i)=='i')
            v++;
        else if(str.charAt(i)=='O'||str.charAt(i)=='o')
            v++;
        else if(str.charAt(i)=='U'||str.charAt(i)=='u')
            v++;
        else if(str.charAt(i)==' ')
            sp++;
        else
            c++;
    }

    System.out.print("\nConstants = "+c+"\nVowels = "+v+"\nSpace = "+sp);
    
}
}
