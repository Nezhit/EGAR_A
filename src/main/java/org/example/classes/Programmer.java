package org.example.classes;

public class Programmer extends Employee{
    public Programmer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work(){
        System.out.println("coding");
    }
}
