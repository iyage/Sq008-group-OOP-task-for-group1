package com.company;

final public class Cleaner extends Staff {
    public Cleaner(String employeeName, String employeeId, int salary, Boolean markAttendance,String department) {
        super(employeeName, employeeId, salary, markAttendance,department);
    }

    public void clean() {
        System.out.println("Mop and Scrub the surface properly with a brush");
    }

    public void askForRaise() {
        System.out.println("I need a raise");
    }
}

