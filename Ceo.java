package com.company;

public class Ceo {
    private String name;

    public Ceo(String name) {
        this.name = name;
    }

    public Staff hire(Applicant applicant){
      Staff  newStaff = new Cleaner(applicant.getName(), "Es2034",5000,true,
              applicant.getDepartment());
        Staff  newStaff1 = new Account(applicant.getName(), "Es2034",10_000,true,
                applicant.getDepartment());
        Staff staff = null;
        if((applicant.getYearsOfExperience() >=3)){
            if (applicant.getDepartment() == "cleaner"){
             staff = newStaff;
            }
            else{
           staff = newStaff1;
            }

        }
        return  staff;
    };
    public  void fire(Staff staff){
       if(staff.getWorkRate()== "Low"){
           System.out.println(staff.getEmployeeId() +" "+ "is fired");
       }
       else {
           System.out.println(staff.getEmployeeName()+" "+"is the staff of the month");
       }
    }
    public void increaseSalary(Staff staff) {
        if (staff.getWorkRate() == "High") {
            System.out.println("Increase the  salary of" + " "+ staff.getEmployeeId());
        }
    }


}
