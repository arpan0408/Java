import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileCount {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new FileReader("test.txt"));

        String str;
        int ch = 0, line = 0, word = 0;
        while((str = bf.readLine()) != null){
            line++;
            ch += str.length();
            word += str.split("\\s+").length;
        }

        System.out.printf("Characters: %d\nWords: %d\nLines: %d",ch,word,line);

        bf.close();
    }
}
