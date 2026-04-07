import java.util.ArrayList;

class NameList {
    String name = "";
    public int count = 0;

    public void addName(String name, ArrayList<String> nameList) {
        synchronized (this) {
            this.name = name;
            count++;
        }

        nameList.add(name);
    }

    public int getCount() {
        return count;
    }
}

public class SyncBlockEx {
    public static void main(String[] args) {
        NameList list_1 = new NameList();
        NameList list_2 = new NameList();
        ArrayList<String> list = new ArrayList<>();

        list_1.addName("Arpan", list);
        list_2.addName("Junior", list);

        System.out.println("Thread1: " + list_1.name + ", " + list_1.getCount() + "\n");
        System.out.println("Thread2: " + list_2.name + ", " + list_2.getCount());
    }
}
