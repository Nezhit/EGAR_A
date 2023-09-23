package org.example.classes;

import org.example.interfaces.IManage;

import java.util.ArrayList;

public class HRmanager implements IManage {
    private ArrayList<Director> employees ;

    @Override
    public void CallSick() {
        for (Director director : employees) {
            double sickLeavePercentage = director.calculateSickSub();

            if (sickLeavePercentage <= 10) {
                System.out.println(director.getName() + ": Оценка навыков управленца - Отлично");
            } else if (sickLeavePercentage <= 20) {
                System.out.println(director.getName() + ": Оценка навыков управленца  - Хорошо");
            } else if (sickLeavePercentage <= 30) {
                System.out.println(director.getName() + ": Оценка навыков управленца - Удовлетворительно");
            } else {
                System.out.println(director.getName() + ": Оценка навыков управленца  - Неудовлетворительно");
            }
        }

    }

    public HRmanager(ArrayList<Director> employees) {
        this.employees = employees;
    }

    public void setEmployees(ArrayList<Director> employees) {
        this.employees = employees;
    }

    public ArrayList<Director> getEmployees() {
        return employees;
    }
}
