package org.example.classes;

import org.example.sickness.Sickness;

import java.util.ArrayList;

public class Director extends Employee{
    ArrayList<Programmer> subordinates;
    @Override
    public void work(){
        for(Programmer concrete:subordinates){
            concrete.increaseSalary(300);
        }
    }
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

    public void work(int x){
        for(Programmer concrete:subordinates){
            concrete.increaseSalary(x);
        }
    }
}
