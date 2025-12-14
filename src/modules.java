import java.util.*;

class module{
    private int id;
    private String course;
    private String name;

    public module(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        module Module = (module) obj;
        return id == Module.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student {" + " id=" + id + ", name='" + name + '\'' + " , course='" + course + '\'' + '}';
    }
}

public class modules{
    public static void main(String args[]) {

        List<module> ls = new ArrayList<>();
        ls.add(new module(101, "Aman", "java"));
        ls.add(new module(102, "Neha", "Python"));
        ls.add(new module(101, "Aman", "java"));
        ls.add(new module(103, "Rohit", "C++"));
        ls.add(new module(102, "Neha", "Python"));
        ls.add(new module(104, "Sahil", "Javascript"));

        System.out.println("Original list with duplicates:");
        ls.forEach(System.out::println);

        Set<module> uniquemodule = new HashSet<>(ls);
        System.out.println("\nUnique Students:");
        uniquemodule.forEach(System.out::println);


        List<module> uniqueStudentList = new ArrayList<>(uniquemodule);
        System.out.println("\nUnique Student List: " + uniqueStudentList);
    }
}