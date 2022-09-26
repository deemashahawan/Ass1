package stu.najah.edu.cap;
import java.time.*;
public class Students {
    private int id;
    private String name;
    private LocalDate  adb;
    static int addVar=0;
    static int retrieveVar=0;
    static int removeVar=0;


    public Students() {

    }

    public Students(int id ,String name, LocalDate  adb) {
        this.id =id;
        this.name=name;
        this.adb=adb;

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

    public LocalDate  getAdb() {
        return adb;
    }

    public void setAdb(LocalDate  adb) {
        this.adb = adb;
    }

    public void getAge()
    {
        LocalDate today = LocalDate.now();
        int age=today.getYear() - adb.getYear();
        System.out.println("Student age: "+age);
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Students)){
            return false;
        }
        Students temp=(Students) obj;
        if ((this.id==temp.id)&&(this.name==temp.name)&&(this.adb==temp.adb))
            return true;
        else
            return false;

    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date of birth='" + adb + '\'' +
                '}';
    }
}
