import java.io.*;

public class MergeFile {
    public static void main(String[] args)throws IOException{
        BufferedReader fin = new BufferedReader(new FileReader("test.txt"));
        BufferedReader fin2 = new BufferedReader(new FileReader("newfile.txt"));
        BufferedWriter fout = new BufferedWriter(new FileWriter("merge.txt"));

        String line;
        while ((line = fin.readLine()) != null) {
            fout.write(line);
            fout.newLine();
        }

        fout.newLine();

        while ((line = fin2.readLine()) != null) {
            fout.write(line);
            fout.newLine();
        }
        fin.close();
        fin2.close();
        fout.close();
        System.out.print("File merged Successfully!");
    }
}
