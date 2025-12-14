import java.util.ArrayList;
import java.util.Scanner;

public class min {

        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        public void addStudent(){
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Course: ");
            String course = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter marks: ");
            double marks = sc.nextInt();
            sc.nextLine();
            Student s = new Student(id, name, age,course,marks);
            list.add(s);
            System.out.println("Student added successfully!");
        }
    public static void main(String[] args) {
            min obj=new min();
            obj.addStudent();
    }


}
