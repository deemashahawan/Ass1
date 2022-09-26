package stu.najah.edu.cap;
import java.time.*;
public class MedicalStudents extends Students{
    private String Hospital;
    private String research;
    public MedicalStudents(int id ,String name, LocalDate  adb,String Hospital) {

        super( id,name, adb);
        this.Hospital=Hospital;
    }
    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String hospital) {
        Hospital = hospital;
    }

    public void submitResearch(String txt){
        this.research=txt;
    }
    public String getResearch(){
        return research;
    }
    @Override
    public String toString() {
        return super.toString() + '\'' +
                ", research='" + research + '\'' +
                ", Hospital='" + Hospital + '\'' +
                '}';
    }

}
