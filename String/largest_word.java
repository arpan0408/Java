package String;
import java.util.*;

public class largest_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.nextLine();
        String st[] = str.split(" ");
        int count = st[0].length(), index = 0, i;
        for (i = 0; i < st.length - 1; i++) {
            for (int j = i + 1; j < st.length; j++) {
                if ((st[j].length()) > count) {
                    count = st[j].length();
                    index = j;
                }
            }
        }
        System.out.println(st[index]);
        sc.close();
    }
}
