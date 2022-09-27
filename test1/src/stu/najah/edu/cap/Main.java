package stu.najah.edu.cap;
import com.sun.org.apache.bcel.internal.Const;

import java.time.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void menu1() {
        System.out.println("***choose student:***");
        System.out.println("1. master student");
        System.out.println("2. medical student");
        System.out.println("3. Engineering student");
        System.out.println("4. Exit");
    }

    static void menu2() {
        System.out.println("***choose a number:***");
        System.out.println("1. add student");
        System.out.println("2. retrieve student");
        System.out.println("3. remove student");
        System.out.println("4. report of #adding,retrieving,removing");
        System.out.println("5. all students in the system");
        System.out.println("6. Exit");
    }
    static void report(int addVar, int retrieveVar, int removeVar) {
        System.out.println("*************************************");
        System.out.println("containing numbers of add= " + addVar);
        System.out.println("containing numbers of retrieve= " + retrieveVar);
        System.out.println("containing numbers of remove= " + removeVar);
        System.out.println("*************************************");


    }


    public static void main(String[] args) {

        ArrayList<MasterStudents> ss1 = new ArrayList<>();
        ArrayList<MedicalStudents> ss2 = new ArrayList<>();
        ArrayList<EngineeringStudents> ss3 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        int choice1, choice2,id,  year, month, day, loc = 0;

        String name;
        LocalDate adb;

        do {
            menu2();
            choice1 = in.nextInt();

          switch (choice1)
            {
                case 1:
                    do{
                        menu1();
                        choice2=in.nextInt();

                        switch (choice2) {
                            case 1:
                                System.out.println("plz enter student inf..");
                                System.out.println("enter id: ");
                                id = in2.nextInt();
                                for (int i = 0; i < ss1.size(); i++) {
                                    if (ss1.get(i).getId() == id) {
                                        System.out.println("invalid id enter another one ..");
                                        id = in2.nextInt();
                                    }
                                }
                                System.out.println("enter name: ");
                                name = in3.nextLine();
                                System.out.println("enter date of birth(1.year,2.month,3.day):  ");
                                year = in2.nextInt();
                                month = in2.nextInt();
                                day = in2.nextInt();
                                adb = LocalDate.of(year, month, day);
                                System.out.println("enter student superVisor:  ");
                                String name2 = in3.nextLine();
                                MasterStudents s1 = new MasterStudents(id, name, adb, name2);
                                ss1.add(s1);
                                System.out.println("*** master student added***");
                                MasterStudents.addVar++;
                                break;
                            case 2:
                                System.out.println("plz enter student inf..");
                                System.out.println("enter id: ");
                                id = in2.nextInt();
                                for (int i = 0; i < ss2.size(); i++) {
                                    if (ss2.get(i).getId() == id) {
                                        System.out.println("invalid id enter another one ..");
                                        id = in2.nextInt();
                                    }
                                }
                                System.out.println("enter name: ");
                                name = in3.nextLine();
                                System.out.println("enter date of birth(1.year,2.month,3.day):  ");
                                year = in2.nextInt();
                                month = in2.nextInt();
                                day = in2.nextInt();
                                adb = LocalDate.of(year, month, day);
                                System.out.println("enter student Hospital: ");
                                String name3=in3.nextLine();
                                MedicalStudents s2=new MedicalStudents(id,name,adb,name3);
                                ss2.add(s2);
                                System.out.println("*** medical student added***");
                                MedicalStudents.addVar++;
                                break;
                            case 3:
                                System.out.println("plz enter student inf..");
                                System.out.println("enter id: ");
                                id = in2.nextInt();
                                for (int i = 0; i < ss3.size(); i++) {
                                    if (ss3.get(i).getId() == id) {
                                        System.out.println("invalid id enter another one ..");
                                        id = in2.nextInt();
                                    }
                                }
                                System.out.println("enter name: ");
                                name = in3.nextLine();
                                System.out.println("enter date of birth(1.year,2.month,3.day):  ");
                                year = in2.nextInt();
                                month = in2.nextInt();
                                day = in2.nextInt();
                                adb = LocalDate.of(year, month, day);
                                EngineeringStudents s3=new EngineeringStudents(id,name,adb);
                                ss3.add(s3);
                                System.out.println("*** engineering student added***");
                                EngineeringStudents.addVar++;
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Not a Valid Choice.");
                                System.out.println("Choose again.");
                                break;
                        }

                    }while (choice2!=4);
                    break;
                case 2:
                    do{
                        menu1();
                        choice2=in.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.println("plz enter student id to retrieve his inf...");
                                id=in2.nextInt();
                                for(int i=0;i<ss1.size();i++){
                                    if(ss1.get(i).getId()==id)
                                        loc=i;
                                }
                                System.out.println( ss1.get(loc).toString());
                                MasterStudents.retrieveVar++;
                                break;
                            case 2:
                                System.out.println("plz enter student id to retrieve his inf...");
                                id=in2.nextInt();
                                for(int i=0;i<ss2.size();i++){
                                    if(ss2.get(i).getId()==id)
                                        loc=i;
                                }
                                System.out.println( ss2.get(loc).toString());
                                MedicalStudents.retrieveVar++;
                                break;
                            case 3:
                                System.out.println("plz enter student id to retrieve his inf...");
                                id=in2.nextInt();
                                for(int i=0;i<ss3.size();i++){
                                    if(ss3.get(i).getId()==id)
                                        loc=i;
                                }
                                System.out.println( ss3.get(loc).toString());
                                EngineeringStudents.retrieveVar++;
                                break;
                            case 4:
                               break;
                            default:
                                System.out.println("Not a Valid Choice.");
                                System.out.println("Choose again.");

                        }

                    }while (choice2!=4);
                    break;

                case 3:
                    do{
                        menu1();
                        choice2=in.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.println("plz enter student id to remove his inf...");
                                id=in2.nextInt();
                                for(int i=0;i<ss1.size();i++){
                                    if(ss1.get(i).getId()==id)
                                        loc=i;
                                }
                                ss1.remove(loc);
                                System.out.println("*** master student removed***");
                                MasterStudents.removeVar++;
                                break;
                            case 2:
                                System.out.println("plz enter student id to remove his inf...");
                                id=in2.nextInt();
                                for(int i=0;i<ss2.size();i++){
                                    if(ss2.get(i).getId()==id)
                                        loc=i;
                                }
                                ss2.remove(loc);
                                System.out.println("*** medical student removed***");
                                MedicalStudents.removeVar++;
                                break;
                            case 3:
                                System.out.println("plz enter student id to remove his inf...");
                                id=in2.nextInt();
                                for(int i=0;i<ss3.size();i++){
                                    if(ss3.get(i).getId()==id)
                                        loc=i;
                                }
                                ss3.remove(loc);
                                System.out.println("*** engineering student removed***");
                                EngineeringStudents.removeVar++;
                                break;
                            case 4:
                               break;
                            default:
                                System.out.println("Not a Valid Choice.");
                                System.out.println("Choose again.");

                        }

                    }while (choice2!=4);
                    break;



                case 4:
                     report(Students.addVar,
                             Students.retrieveVar,
                             Students.removeVar);
                    break;
                case 5:
                    System.out.println(" all master students=>");
                    System.out.println(ss1);
                    System.out.println(" all medical students=>");
                    System.out.println(ss2);
                    System.out.println(" all engineering students=>");
                    System.out.println(ss3);
                    break;

                case 6:

                    break;

                default:
                    System.out.println("Not a Valid Choice.");
                    System.out.println("Choose again.");
                    break;
            }

        }while (choice1 !=6);


        }}