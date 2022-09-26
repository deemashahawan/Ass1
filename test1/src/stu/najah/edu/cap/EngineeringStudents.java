package stu.najah.edu.cap;
import java.time.*;
public class EngineeringStudents extends Students{
    private String submitLab;

    public EngineeringStudents( int id,String name, LocalDate  adb) {

        super(id, name, adb);
    }

    public void submitLab(String txt){
        submitLab=txt;
    }
    public String getSubmitLab(){
        return submitLab;
    }
    @Override
    public String toString() {
        return super.toString() + '\'' +
                ", submitLab='" + submitLab + '\'' +
                '}';
    }
}
