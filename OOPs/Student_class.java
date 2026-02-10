class Student{
    String name;
    int rollno;
    int marks;
}

public class Student_class {
    public static void main(String[]args) {
        Student s1 = new Student();
        s1.name = "Arpan";
        s1.rollno = 27;
        s1.marks = 90;

        System.out.println("Name: "+s1.name);
        System.out.println("Roll no.: "+s1.rollno);
        System.out.println("Marks: "+s1.marks);
    }
}