package org.example.classes;

import org.example.sickness.Sickness;
import org.example.task.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Programmer extends Employee{
    private List<Sickness> sickDays = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();
    public Programmer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work(){
        System.out.println("coding");
    }
    public void addSickDay(Sickness sd) {
        sickDays.add(sd);
        sd.setEmployee(this);
    }
    public void addTask(Task t) {
        LocalDate tld = t.getStartDate().toLocalDate();

        validateSickDays(tld);
        tasks.add(t);
        t.setExecutor(this);
        System.out.println("Задача добавлена");
    }

    private void validateSickDays(LocalDate tld) {
        var isExistsSickDay = sickDays
                .stream()
                .anyMatch(s -> s.getDate().equals(tld));
        if (isExistsSickDay) {
            throw new IllegalStateException("Программист на больничном");
        }
    }
    public boolean isOnSick(LocalDate tld) {
        var isExistsSickDay = sickDays
                .stream()
                .anyMatch(s -> s.getDate().equals(tld));
        if (isExistsSickDay) {
            return true;
        }
        return false;
    }

}
