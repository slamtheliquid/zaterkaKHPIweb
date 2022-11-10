class User {
    constructor(user, rank){
        this.user = user;
        this.rank = rank;
        this.notify = ''
    }
    getUser(){
        return 'USER: ' + this.user + ', ' + this.rank.userRank() + '\n'
    }
}
class UserRankType {
    userRank(){}
}
class RankUser extends UserRankType{
    userRank(){
        return 'RANK: USER'
    }
}
class RankAdmin extends UserRankType{
    userRank(){
        return 'RANK: ADMIN'
    }
}
class NotificationMethod {
    notification(){}
}
class NotificationEmail extends NotificationMethod{
    notification(){
        return 'EMAIL'
    }
}
class NotificationSMS extends NotificationMethod{
    notification(){
        return 'SMS'
    }
}
class NotificationMessenger extends NotificationMethod{
    notification(){
        return 'MESSENGER'
    }
}
class UserNotificationType extends NotificationMethod{
    constructor(type) {
        super()
        this.type = type;
    }
    userNotificationType(){
        return this.type.notification()
    }
}
class Project{
    constructor(notificationHandler, notificationHandlerAdmin, name, editableState) {
        this.notificationHandler = notificationHandler;
        this.notificationHandlerAdmin = notificationHandlerAdmin;
        this.name = name;
        this.editableState = editableState;
        this.userList = [];
        this.logs = [];
    }
    getName(){
        return 'New project named ' + this.name + '\n'
    }
    getState(){
        return 'State of the project "' + this.name + '" is "' + this.editableState + '"\n'
    }
    notifyAdmin(admin, user){
        return  admin.user + ', new participant added!: ' + user.user + '. Notified with ' + this.notificationHandlerAdmin.userNotificationType() + '\n'
    }
    specifyNotificationType(){
        return 'Notification type: ' + this.notificationHandler.userNotificationType() + '\n'
    }
    specifyNotificationTypeAdmin(){
        return 'Notification type for admins: ' + this.notificationHandlerAdmin.userNotificationType() + '\n'
    }
    addUser(user){
        this.userList.push(user);
        user.notify = this.notificationHandler.userNotificationType()
        let adm;
        for(let i = 0; i < this.userList.length; i++){
            if(this.userList[i].rank.userRank() === 'RANK: ADMIN'){
                adm = this.userList[i];
                this.userList[i].notify = this.notificationHandlerAdmin.userNotificationType()
            }else{
                return this.notifyAdmin(adm, user)
            }
        }
        return 'User ' + user.user + ' added to project ' + this.name + '\n';
    }
    getUserList(){
        return this.userList
    }
    editState(user, state){
        this.editableState = state;
        this.logs.push({
            id: Date.now(),
            editor: user,
            newState: state,
            dateEdited:  new Date(Date.now()).toString()
        })
        return 'State was successfully edited by ' + user.user + '\n';
    }
    getLogs(){
        return this.logs
    }
}
class Task{
    constructor(task) {
        this.task = task;
        this.taskList = {};
    }
    createTask(user){
        this.taskList = {
            taskID: Date.now(),
            forUser: user,
            task: this.task
        };
        return  user.user + '! A new task were added for you. Notified with ' + user.notify + '\n'
    }
    getTask(){
        return this.taskList
    }
}
const adminNotifyType = new UserNotificationType(new NotificationMessenger());
const userNotifyType = new UserNotificationType(new NotificationSMS());
const project = new Project(adminNotifyType, userNotifyType, 'Joomla Website Creation', 'New Project');
const admin = new User('Admin', new RankAdmin())
const junior = new User('Junior', new RankUser())
const senior = new User('Senior', new RankUser())
const headerTask = new Task('Change margin on header');
const bodyTask = new Task('Move the tag name <body> upwards a bit');
const footerTask = new Task('Change the style of footer according to design from Figma');

console.log(project.getName());
console.log(project.specifyNotificationType())
console.log(project.specifyNotificationTypeAdmin())
console.log(admin.getUser())
console.log(junior.getUser())
console.log(project.addUser(admin));
console.log(project.addUser(junior));
console.log(project.addUser(senior));
console.log(project.getUserList());
console.log(project.editState(junior, 'I changed a state'));
console.log(project.getState());
console.log(project.getLogs());
console.log(headerTask.createTask(junior));
console.log(bodyTask.createTask(senior));
console.log(footerTask.createTask(admin));
console.log(footerTask.getTask());