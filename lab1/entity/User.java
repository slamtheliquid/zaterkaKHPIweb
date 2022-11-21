package lab1.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private long id;
    private String name;
    private Role role;
    private final List<Task> tasks;

    public User(long id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        if (!tasks.contains(task)) {
            tasks.add(task);
            if (this.equals(task.getAssignee())) {
                task.setAssignee(this);
            }
        }
    }

    public void removeTask(Task task) {
        tasks.remove(task);
        if (task.getAssignee().equals(this)) {
            task.setAssignee(null);
        }
    }

    public boolean containsTask(Task task) {
        return tasks.contains(task);
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public enum Role {
        FE, BE, QA, AQA
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
