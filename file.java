import java.io.*;
import java.util.*;

public class file {
    public static void main(String[]args)throws IOException
    {
        File f = new File("d:/java/test.txt");
        if(f.createNewFile())
        System.out.println("file created");
        else
        System.out.println("Already exists");

        Scanner sc = new Scanner(f);

        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }

        System.out.println(f.getPath());

        FileWriter fw = new FileWriter("d:/java/test.txt");
        fw.write("Hello");

        if(f.exists())
    {
        f.delete();
        System.out.println(f.getName()+" is deleted");
    }
        else
        System.out.println("no file");
        fw.close();
    }
    
}
