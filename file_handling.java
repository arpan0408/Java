import java.util.*;
import java.io.*;

public class file_handling {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("File Handling: \n\n");

        File f = new File("D:/Java/test.txt");
        if(f.createNewFile())
        System.out.println("file created");
        else
        System.out.println("Already created");

        // try{
        // }
        // catch(IOException e)
        // {
        // System.out.println(e.getMessage());
        // }

        FileOutputStream fout = new FileOutputStream("D:/Java/test.txt", true);

        // char ch = 'k';
        // fout.write(ch);
        
        
        String str = sc.nextLine();
        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++)
            fout.write(ch[i]);

        // File f = new File("D:/Java/test.txt");
        
        // f.getName();
        // f.getAbsolutePath();
        // f.lastModified();
        // f.canWrite();
            
        fout.close();
        sc.close();
    }
}