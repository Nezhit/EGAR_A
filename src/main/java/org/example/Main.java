package org.example;

import org.example.classes.Director;
import org.example.classes.HRmanager;
import org.example.classes.Programmer;
import org.example.sickness.Sickness;
import org.example.task.Task;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer("Rabotnik 1",100);
        ArrayList<Programmer> lst=new ArrayList<>();
        lst.add(p);
        Director d=new Director(lst,"Director1",1500);
        ArrayList<Director> dirlst=new ArrayList<>();
        dirlst.add(d);
        HRmanager hr=new HRmanager(dirlst);
        p.addSickDay(new Sickness(LocalDate.parse("2023-09-22")));
        p.addSickDay(new Sickness(LocalDate.now()));
        Task t= new Task("backend","Сделать хороший бэк",
                hr,
                p,
                LocalDateTime.now(), Duration.ofDays(4));
        p.addTask(t);

    }
}