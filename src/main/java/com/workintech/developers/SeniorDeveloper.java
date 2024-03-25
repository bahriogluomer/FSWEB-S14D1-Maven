package com.workintech.developers;

public class SeniorDeveloper extends Employee {

    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(80000);
        System.out.println(getName() + " started working as Senior Developer");
    }
}
