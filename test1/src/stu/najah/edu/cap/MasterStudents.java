package stu.najah.edu.cap;
import java.time.*;
public class MasterStudents extends Students{
    private String research;
    private String superVisor;
    enum BA {
        COMMUNICATION, EDUCATION, ENGLISH, FOREIGN_LANGUAGE, PHILOSOPHY, PSYCHOLOGY, SOCIOLOGY;

    }
    public MasterStudents(int id, String name, LocalDate  adb,String superVisor) {
        super(id, name, adb);
        this.superVisor=superVisor;

    }

    public void submitResearch(String txt){
         research=txt;
    }
    public String getResearch(){
        return research;
    }
    public void setSuperVisor(String superVisor){
        this.superVisor=superVisor;
    }
    public String getSuperVisor(){
      return superVisor;
    }
    @Override
    public String toString() {
        return super.toString()+ '\'' +
                ", research='" + research + '\'' +
                ", superVisor='" + superVisor + '\'' +
                '}';
    }

}
