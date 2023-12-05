import java.util.*;

class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println("Runable A -> "+i);
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println("Runable B -> "+i);
    }
}

public class runable
{
    public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Type of threading : \n" );

    A obj = new A();
    B obj1 = new B();
    obj.run();
    obj1.run();
    
    sc.close();
}
}
