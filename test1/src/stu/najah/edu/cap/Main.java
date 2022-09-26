package stu.najah.edu.cap;
import java.time.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void menu(){
        System.out.println("choose a number");
        System.out.println("1. add student");
        System.out.println("2. retrieve student");
        System.out.println("3. remove student");
        System.out.println("4. report of #adding,retrieving,removing");
        System.out.println("5. read all students in the system");
        System.out.println("6. student Age");
        System.out.println("7. Exit");
    }
    static void report(int addVar,int retrieveVar,int removeVar ){
        System.out.println("*************************************");
        System.out.println("containing numbers of add= "+addVar);
        System.out.println("containing numbers of retrieve= "+retrieveVar);
        System.out.println("containing numbers of remove= "+removeVar);
        System.out.println("*************************************");


    }



    public static void main(String[] args) {

        ArrayList<Students> ss=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        Scanner in2=new Scanner(System.in);
        Scanner in3=new Scanner(System.in);
        int choice,id,year, month,day,loc=0;
        String name;
        LocalDate adb;

        do
        {
            menu();
            System.out.println("Enter your choice from 1-7 and press return: ");
            choice=in.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("plz enter student inf..");
                    System.out.println("enter id: ");
                    id=in2.nextInt();
                    for(int i=0;i<ss.size();i++){
                        if(ss.get(i).getId()==id){
                            System.out.println("invalid id enter another one ..");
                            id=in2.nextInt();
                        }
                    }
                    System.out.println("enter name: ");
                    name = in3.nextLine();
                    System.out.println("enter date of birth(1.year,2.month,3.day):  ");
                    year=in2.nextInt();
                    month= in2.nextInt();
                    day= in2.nextInt();
                    adb=LocalDate.of(year,month,day);
                    Students s1=new Students(id,name,adb);
                    ss.add(s1);
                    System.out.println("student added");
                    Students.addVar++;
                    break;
                case 2:
                    System.out.println("plz enter student id to retrieve his inf...");
                    id=in2.nextInt();
                    for(int i=0;i<ss.size();i++){
                        if(ss.get(i).getId()==id)
                            loc=i;
                    }
                    System.out.println( ss.get(loc).toString());
                    Students.retrieveVar++;
                    break;
                case 3:
                    System.out.println("plz enter student id to retrieve his inf...");
                    id=in2.nextInt();
                    for(int i=0;i<ss.size();i++){
                        if(ss.get(i).getId()==id)
                            loc=i;
                    }
                    ss.remove(loc);
                    System.out.println("student removed");
                    Students.removeVar++;
                    break;
                case 4:
                     report(Students.addVar,Students.retrieveVar,Students.removeVar);
                    break;
                case 5:
                    System.out.println(ss);
                    break;
                case 6:
                    System.out.println("plz enter student id to getAge...");
                    id=in2.nextInt();
                    for(int i=0;i<ss.size();i++){
                        if(ss.get(i).getId()==id)
                            loc=i;
                    }
                    ss.get(loc).getAge();
                    break;
                case 7:

                    break;

                default:
                    System.out.println("Not a Valid Choice.");
                    System.out.println("Choose again.");
                    break;
            }

        }while (choice !=7);












    }
}
