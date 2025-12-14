public class employee {
    private int id;
    private String ename;
    private int age;
    private String compony;

    public employee(int id,String ename,int age,String compony){
        this.id=id;
        this.ename=ename;
        this.age=age;
        this.compony=compony;
    }
    public void wstatus(){
        System.out.println(ename+ " is working");
    }
    public void cname()
    {
        System.out.println(compony + " this is compony name");
    }
    public void displayinfo(){
        System.out.println(this.toString());
    }

    public void eage(){
        System.out.println(age +" it is employee age");
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getEname()
    {
        return ename;
    }
    public void setEname(String enmae)
    {
        this.ename=ename;
    }
    public String getCompony()
    {
        return compony;
    }
    public void setCompony(String compony)
    {
        this.compony=compony;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + ename + '\'' +
                ", age=" + age +
                ", company='" + compony + '\'' +
                '}';
    }

}
