import java.util.*;

class a extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println("Class A -> "+i);
    }
}

class b extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println("Class B -> "+i);
    }
}

public class thread
{
    public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("The process of thread." );
    
    a obj = new a();
    b obj1 = new b();
    obj.start();
    obj1.start();
    
    sc.close();
}
}
