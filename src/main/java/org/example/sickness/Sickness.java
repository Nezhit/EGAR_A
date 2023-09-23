package org.example.sickness;

import org.example.classes.Employee;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Sickness {

    private Employee employee;
    private LocalDate date;


    public static boolean isEmployeeOnSickLeave(Employee employee) {
        long currentTimeMillis = System.currentTimeMillis();

        // Генерируем случайное число в диапазоне от 0 до текущего времени
        long randomTimeMillis = ThreadLocalRandom.current().nextLong(1650000000000L, currentTimeMillis+62556952000L);

        // Создаем объект Date с полученным случайным временем
        Date endDate = new Date(randomTimeMillis);
        if (endDate != null) {

            Calendar calendar = Calendar.getInstance();
            Date currentDate = calendar.getTime();
            return currentDate.before(endDate) || currentDate.equals(endDate);
        }
        return false; // Если endDate равно null, сотрудник не на больничном.
    }

    public Sickness(LocalDate date) {
        this.date = date;
    }

    public Sickness(Employee employee, LocalDate date) {
        this.employee = employee;
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
