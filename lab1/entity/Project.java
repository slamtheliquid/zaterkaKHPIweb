package lab1.entity;

import lab1.message.Notificator;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private final List<User> members;
    private final List<Task> tasks;
    private User administrator;

    private Notificator adminNotificator;
    private Notificator memberNotificator;

    public Project(User administrator, Notificator adminNotificator, Notificator memberNotificator) {
        this.administrator = administrator;
        this.adminNotificator = adminNotificator;
        this.memberNotificator = memberNotificator;
        this.members = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void assignTask(User assignee, Task task) {
        if (!members.contains(assignee)) {
            adminNotificator.notify(administrator, assignee + " ==> this user doesn't belong to this project");
        }
        if (!tasks.contains(task)) {
            tasks.add(task);
        }
        assignee.addTask(task);
        memberNotificator.notify(assignee, "a new task was assigned to you ==> " + task);
    }

    public void addMember(User member) {
        if (!members.contains(member)) {
            members.add(member);
            adminNotificator.notify(administrator, "new member ==> " + member);
        }
    }

    public void setAdminMessenger(Notificator adminNotificator) {
        this.adminNotificator = adminNotificator;
    }

    public void setMemberMessenger(Notificator memberNotificator) {
        this.memberNotificator = memberNotificator;
    }

    public void setAdministrator(User newAdmin) {
        this.administrator = newAdmin;
    }

    public List<User> getMembers() {
        return new ArrayList<>(members);
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }
}
