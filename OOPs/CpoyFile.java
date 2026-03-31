import java.io.*;

public class CpoyFile {
    public static void main(String[] args) {
        try {
            BufferedInputStream fin = new BufferedInputStream(new FileInputStream("test.txt"));
            BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream("newfile.txt"));

            fout.write(fin.readAllBytes());
            fout.flush();
            System.out.println("File copied successfuly!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
