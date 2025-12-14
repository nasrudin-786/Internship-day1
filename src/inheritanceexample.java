public class inheritanceexample {
    class person{
        String name;
        int age;

        public void display(){
            System.out.println(name+"-"+age);
        }
    }

    class Student extends person{
        String course;
    }
    class Employee extends person{
        double salary;
    }

}
