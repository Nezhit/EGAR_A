package org.example.task;

import org.example.classes.HRmanager;
import org.example.classes.Programmer;

import java.time.Duration;
import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private HRmanager creator;
    private Programmer executor;
    private LocalDateTime startDate;
    private Duration duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HRmanager getCreator() {
        return creator;
    }

    public void setCreator(HRmanager creator) {
        this.creator = creator;
    }

    public Programmer getExecutor() {
        return executor;
    }

    public void setExecutor(Programmer executor) {
        this.executor = executor;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Task(String title, String description, HRmanager creator, Programmer executor, LocalDateTime startDate, Duration duration) {
        this.title = title;
        this.description = description;
        this.creator = creator;
        this.executor = executor;
        this.startDate = startDate;
        this.duration = duration;
    }
}