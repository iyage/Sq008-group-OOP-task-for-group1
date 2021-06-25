package com.company;

import java.util.ArrayList;
//The project is made as simple as possible.
public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Staff> staffRegister = new ArrayList<>();
        Account staff1= new Account("Iyage Godwin","I234",5000,true,"account");
        Account staff2= new Account("Tola Allen","E234",65000,false,"account");
       staff1.setWorkRate("Low");
        staff2.setWorkRate("high");
       Cleaner staff3= new Cleaner("Iyage Godwin","I234",5000,true,"cleaner");
       Cleaner staff4= new Cleaner("Tola Allen","E234",65000,false,"cleaner");
       ArrayList<Applicant> applicants = new ArrayList<>();
       Applicant applicant1 = new Applicant(2,"Ajibola Olawale","Bsc",35,"account");
       Applicant applicant2 = new Applicant(4,"Olabiwanninu Ayeola","Bsc",30,
                "Cleaner");
        Applicant applicant3 =new Applicant(5,"Segun Lawal","Ssce",20,
                "account");

        staff3.setWorkRate("Low");
        staff2.setWorkRate("High");
        Ceo chikaObi = new Ceo("Chika  Nwobi");
        System.out.println();
        // populating the Staff Register;
        staffRegister.add(staff1);
        staffRegister.add(staff2);
        staffRegister.add(staff3);
        staffRegister.add(staff4);
        staffRegister.add(chikaObi.hire(applicant2));
        staffRegister.add(chikaObi.hire(applicant3));
        staffRegister.add(chikaObi.hire(applicant1));
        //populate applicant register
        applicants.add(applicant1);
        applicants.add(applicant2);
        applicants.add(applicant3);
        // instantiate the company object
        Company company = new Company(chikaObi,staffRegister,applicants,"10, Laide street","Dangote");
        // printout the list of the company staff;
        aa:for(Staff staff:company.getStaff()){
            try {
                System.out.println(staff.getEmployeeName()+" "+ staff.getDepartment());
            }
           catch (NullPointerException exception){
                continue aa;
           }
        }
        // printout the list applicant
        for (Applicant applicant:applicants) {
            System.out.println("Applicant Name :"+applicant.getName()+"-"+"Applicant years of Experience :"+applicant.getYearsOfExperience()
                    +"-"+"Department applied for : "+applicant.getDepartment()+ "-"+" Qualification: "+applicant.getQualification()+"-"+"Age:"+applicant.getAge()  );
        }
    }

}
