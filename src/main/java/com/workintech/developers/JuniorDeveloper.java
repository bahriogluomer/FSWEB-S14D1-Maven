package com.workintech.developers;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(40000);
        System.out.println(getName() + " started working as Junior Developer");
    }
}
