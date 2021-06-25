package com.company;

public class Staff {
   private  String EmployeeName;
   private String EmployeeId;
   private int salary;

    public Staff() {
        this.department = department;
    }

    private String department;
    Boolean markAttendance;

    public String getDepartment() {
        return department;
    }

    //private  String[] workRate = {"High","Average","Low"};
    private  String workRate;

    public String getWorkRate() {
        String workRate ="";
        if((this.workRate.equalsIgnoreCase("Low")) ||(this.workRate.equalsIgnoreCase("High"))||(this.workRate.equalsIgnoreCase("Average")))
        {
          workRate = this.workRate;
        }
        else {
            System.out.println("Invalid input");
        }
        return workRate;
    }

    public void setWorkRate(String workRate) {
        this.workRate = workRate;
    }

    public Staff(String employeeName, String employeeId, int salary, Boolean markAttendance,String department) {
        EmployeeName = employeeName;
        EmployeeId = employeeId;
        this.salary = salary;
        this.markAttendance = markAttendance;
        this.department = department;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Boolean getMarkAttendance() {
        return markAttendance;
    }

    public void setMarkAttendance(Boolean markAttendance) {
        this.markAttendance = markAttendance;
    }
}
