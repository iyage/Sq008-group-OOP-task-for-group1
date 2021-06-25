package com.company;

public class Cleaner extends Staff {
    public Cleaner(String employeeName, String employeeId, int salary, Boolean markAttendance,String department) {
        super(employeeName, employeeId, salary, markAttendance,department);
    }

    public void clean() {
        System.out.println("mop and Scrub the surface properly");
    }

    public void askForRaise() {
        System.out.println("I need a raise");
    }
}

