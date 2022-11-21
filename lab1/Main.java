package lab1;

import lab1.entity.Project;
import lab1.entity.Task;
import lab1.entity.User;
import lab1.logger.ConsoleLogger;
import lab1.logger.Logger;
import lab1.message.MessengerNotificator;
import lab1.message.SmsNotificator;

public class Main {

    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();

        User admin = new User(1L, "adm", User.Role.BE);
        Project project = new Project(admin, new SmsNotificator(), new MessengerNotificator());

        User devFrontUser = new User(2L, "dev_front_user", User.Role.FE);
        User devBackUser = new User(3L, "dev_back_user", User.Role.BE);
        User devQAUser = new User(4L, "dev_qa_user", User.Role.QA);

        Task frontTask = new Task(1L, logger);
        frontTask.setDescription("task_desc_front");
        Task backTask = new Task(2L, logger);
        backTask.setDescription("task_desc_back");
        Task qaTask = new Task(3L, logger);
        qaTask.setDescription("task_desc_qa");

        project.addMember(devFrontUser);
        project.addMember(devBackUser);
        project.addMember(devQAUser);
        project.assignTask(devFrontUser, frontTask);
        project.assignTask(devBackUser, backTask);
        project.assignTask(devQAUser, qaTask);
    }
}
