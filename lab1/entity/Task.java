package lab1.entity;

import lab1.logger.Logger;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;

public class Task {
    private final long id;
    private String description;
    private User assignee;

    private Logger logger;

    public Task(long id, Logger logger) {
        this.id = id;
        this.logger = logger;
    }

    public void setDescription(String description) {
        this.description = description;
        logger.log("task " + id + " description updated to ==> " + description);
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
        Optional.ofNullable(assignee).ifPresent(user -> user.addTask(this));
        logger.log("task " + id + " assignee updated to ==> " + assignee);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public String getDescription() {
        return description;
    }

    public User getAssignee() {
        return assignee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
