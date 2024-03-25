package com.workintech.developers;

public class MidDeveloper extends Employee {

    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(60000);
        System.out.println(getName() + " started working as Mid Developer");
    }
}
