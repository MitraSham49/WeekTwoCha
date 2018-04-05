package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ResumMain {
    public static void main(String[] args){
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<EduDegree> eduDegrees =new ArrayList<>();
        ArrayList<Experince> experinces =new ArrayList<>();
        ArrayList<Program> programs = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        //add a new person
        //create a person from our object
        Person newPerson = new Person();
        EduDegree newEduDegree = new EduDegree();
        Experince newExperince =new Experince();
        Program newProgram = new Program();

        boolean donePer = false;
        boolean doneEdu = false;
        boolean doneExp = false;
        boolean doneSkil = false;

        String again = "";
        String SkillEnter="";


    /*   do {

            newPerson = new Person();
            System.out.println("Enter Person Name");
            newPerson.setFirstName(scan.nextLine());
            System.out.println("Enter Person  Last Name");
            newPerson.setLastName(scan.nextLine());
            System.out.println("Enter Person Email");
            newPerson.setEmail(scan.nextLine());
            persons.add(newPerson);
            //System.out.println(newPerson);


            System.out.println("Do you want continue?(Y/N)");
            again = scan.nextLine();
            if (again.equalsIgnoreCase("y")) {
                donePer = true;
            }else{donePer =false;}
        } while (donePer);
       */

        // education
        /*
         do {
             newEduDegree = new EduDegree();
             System.out.println("Enter your Degree");
             newEduDegree .setDegree(scan.nextLine());
             System.out.println("Enter your Education");
             newEduDegree .setEducation(scan.nextLine());
             System.out.println("Enter Name of university");
             newEduDegree.setUniversity(scan.nextLine());
             System.out.println("Enter year graduated");
             newEduDegree.setYear(scan.nextLine());
             eduDegrees.add(newEduDegree);
            // System.out.println(newEduDegree);


             System.out.println("Do you want  add new degree?(Y/N)");
             again = scan.nextLine();
             if (again.equalsIgnoreCase("y")) {
                 doneEdu = true;
             }else{doneEdu =false;}
         }while (doneEdu);

*/

         ///  end report

// add  Experince

        /*
        do {
            newExperince =new Experince();
            System.out.println("Enter your Job title");
            newExperince.setJobTitle(scan.nextLine());
            System.out.println("Enter name of Company ");
            newExperince.setCompany(scan.nextLine());
            System.out.println("Start date");
            newExperince.setStartYear(scan.nextLine());
            System.out.println("End date");
            newExperince.setEndYear(scan.nextLine());
             // add a line for not enter input

            System.out.println(" add some summary of your Job");
            newExperince.setDescription(scan.nextLine());
            experinces.add(newExperince);
            System.out.println(newExperince);

///
            System.out.println("Do you want  add new Experince?(Y/N)");
            again = scan.nextLine();
            if (again.equalsIgnoreCase("y")) {
                doneExp= true;
            }else{doneExp =false;}
        }while (doneExp);

        */

        do {
             newProgram = new Program();
            SkillEnter= "";
            System.out.println("Enter your  Skill");
            newProgram.setSkill(scan.nextLine());
            System.out.println(" set your skill rate , e.g. 1 to 5");
            newProgram.setSkillRate(scan.nextLine());

            programs.add(newProgram);
            System.out.println(newProgram);

            System.out.println("Do you want  add new Skill?(Y/N)");

            again = scan.nextLine();
            if (again.equalsIgnoreCase("y")) {
                doneSkil= true;
            }else{doneSkil =false;}
        }while (doneSkil);
        //System.out.println("------------------------");
        for (Person eachPerson : persons) {

            System.out.println("------------------------");
           // System.out.println(" For Person:" + eachPerson.getFirstName());
            System.out.println(eachPerson.toString());
        }

        System.out.println(" Education:" );
        for (EduDegree eachEduDegree : eduDegrees){
            System.out.println(eachEduDegree.toString());
        }


        System.out.println(" Experince:" );
        for (Experince eachExperince : experinces) {
            System.out.println(eachExperince.toString());

        }

            System.out.println(" Skills:" );
            for (Program eachProgram : programs){
                System.out.println(eachProgram.toString());
        }
    }
}
