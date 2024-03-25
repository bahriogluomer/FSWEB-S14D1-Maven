package com.workintech.developers;

public class HRManager extends Employee {

    private String[] JuniorDevelopers = new String[10];
    private String[] MidDevelopers = new String[10];
    private String[] SeniorDevelopers = new String[10];

    //maybe needs refactoring
    public void addEmployee(String name, int index, Employee employee) {
        if (index >= 0 && index < JuniorDevelopers.length && JuniorDevelopers[index] == null && employee instanceof JuniorDeveloper) {
            JuniorDevelopers[index] = name;
        } else if (index >= 0 && index < MidDevelopers.length && MidDevelopers[index] == null && employee instanceof MidDeveloper) {
            MidDevelopers[index] = name;
        } else if (index >= 0 && index < SeniorDevelopers.length && SeniorDevelopers[index] == null && employee instanceof SeniorDeveloper) {
            SeniorDevelopers[index] = name;
        }else {
            System.out.println("Invalid index or employee type");
            throw new IllegalArgumentException();
        }
    }

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(40000);
        System.out.println(getName() + " started working as HR Manager");
    }
}
