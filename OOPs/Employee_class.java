import java.util.*;

class Employee{
    String name;
    int id;
}

public class Employee_class {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[5];
        
        for(int i=0; i<5; i++){
            e[i] = new Employee();
            System.out.printf("Enter the details of Employee %d:\n",i+1);
            System.out.println("Enter the name: ");
            e[i].name = sc.nextLine();
            System.out.println("Enter the id: ");
            e[i].id = sc.nextInt();

            sc.nextLine();
        }

        System.out.println("Employee details:");
        for(int i=0; i<5; i++){
            System.out.println("Name: "+e[i].name);
            System.out.println("Id: "+e[i].id);
        }

        sc.close();
    }
}