import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class File {
    static void readFile(String filename) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = f.readLine()) != null) {
            System.out.println(line);
        }
        f.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name : ");

        try {
            readFile(sc.nextLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}