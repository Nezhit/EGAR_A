package org.example.classes;

import org.example.sickness.Sickness;

import java.time.LocalDate;
import java.util.ArrayList;

public class Director extends Employee{
    ArrayList<Programmer> subordinates;
    @Override
    public void work() {
        try {
            if (subordinates != null) {
                for (Programmer concrete : subordinates) {
                    concrete.increaseSalary(300);
                }
            } else {
                System.out.println("No subordinates to work with.");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
    /*
    public double calculateSickLeavePercentage() {
        int totalSubordinates = subordinates.size();
        if (totalSubordinates == 0) {
            return 0.0; // Возвращаем 0, если нет подчиненных.
        }

        int sickSubordinates = 0;
        for (Programmer subordinate : subordinates) {
            if (Sickness.isEmployeeOnSickLeave(subordinate)) {
                sickSubordinates++;
            }
        }

        return (double) sickSubordinates / totalSubordinates * 100;
    }

     */
    public double calculateSickSub(){
        int totalSubordinates = subordinates.size();
        if (totalSubordinates == 0) {
            return 0.0; // Возвращаем 0, если нет подчиненных.
        }

        int sickSubordinates = 0;
        for (Programmer subordinate : subordinates) {
            LocalDate tld = LocalDate.now();

            if(subordinate.isOnSick(tld)){
                sickSubordinates++;
            }
        }

        return (double) sickSubordinates / totalSubordinates * 100;
    }

    public void work(int x) {
        try {
            if (subordinates != null) {
                for (Programmer concrete : subordinates) {
                    concrete.increaseSalary(x);
                }
            } else {
                System.out.println("No subordinates to work with.");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }

    public ArrayList<Programmer> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(ArrayList<Programmer> subordinates) {
        this.subordinates = subordinates;
    }

    public Director(ArrayList<Programmer> subordinates,String name,int x) {
        super(name,x);
        this.subordinates = subordinates;
    }
}
