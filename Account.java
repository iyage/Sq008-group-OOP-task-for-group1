package com.company;

public class Account  extends  Staff{
    public Account(String employeeName, String employeeId, int salary, Boolean markAttendance,String department) {
        super(employeeName, employeeId, salary, markAttendance,department);
    }

    public  void issueVoucher(String payment){
        System.out.println("Raising voucher for"+payment );
    }
    public  void paySalary(int amount){
        System.out.println("Salary paid is"+" "+amount);
    }
}
