public class course {
    private int id;
    private String name;
    private int duration;
    private int fees;

    public course(int id, String name, int duration, int fees) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.fees = fees;
    }

    public void paid() {
        System.out.println(name + " is paid");
    }

    public void displayinfo() {
        System.out.println(this.toString());
    }

    public void isavailable() {
        System.out.println(name + " it is available");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees =fees;
    }
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", fees=" + fees +
                '}';
    }




}
