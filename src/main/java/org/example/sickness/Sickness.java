package org.example.sickness;

import org.example.classes.Employee;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Sickness {

    private Employee employee;
    private LocalDate startDate;
    private Date endDate;
    private boolean available;
    public static boolean isEmployeeOnSickLeave(Employee employee) {
        // Получаем текущее время в миллисекундах
        long currentTimeMillis = System.currentTimeMillis();

        // Генерируем случайное число в диапазоне от 0 до текущего времени
        long randomTimeMillis = ThreadLocalRandom.current().nextLong(0, currentTimeMillis);

        // Создаем объект Date с полученным случайным временем
        Date endDate = new Date(randomTimeMillis);
        if (endDate != null) {

            Calendar calendar = Calendar.getInstance();
            Date currentDate = calendar.getTime();
            return currentDate.before(endDate) || currentDate.equals(endDate);
        }
        return false; // Если endDate равно null, сотрудник не на больничном.
    }
    public Sickness(Employee employee, LocalDate startDate, Date endDate, boolean available) {
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.available = available;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
