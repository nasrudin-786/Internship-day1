//week 2 day 1
import java.util.ArrayList;

public class Mainn {

    static class Students {
        private int id;
        private String name;
        private String course;

        public Students(int id, String name, String course) {
            this.id = id;
            this.name = name;
            this.course = course;
        }

        public int getId() {
            return id;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setCourse(String course) {
            this.course = course;
        }

        public String toString() {
            return id + " - " + name + " - " + course;
        }
    }

    static ArrayList<Students> list = new ArrayList<>();

    static void addStudent(Students s) {
        list.add(s);
    }

    static void displayAll() {
        for (Students s : list) {
            System.out.println(s);
        }
    }

    static Students searchStudent(int id) {
        for (Students s : list) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }

    static void updateStudent(int id, String newName, String newCourse) {
        Students s = searchStudent(id);
        if (s != null) {
            s.setName(newName);
            s.setCourse(newCourse);
            System.out.println("Updated!");
        }
    }

    static void deleteStudent(int id) {
        Students s = searchStudent(id);
        if (s != null) {
            list.remove(s);
            System.out.println("Deleted!");
        }
    }

    public static void main(String[] args) {

        addStudent(new Students(1, "Rahul", "Java"));
        addStudent(new Students(2, "Ali", "Python"));

        displayAll();

        updateStudent(1, "Rahul kumbhar", "Advanced Java");

        deleteStudent(2);

        displayAll();
    }
}
