package org.example.classes;

public  class Employee {
    private String name;
    private int salary;
    public void work(){

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void increaseSalary(int salary) {
        this.salary += salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
