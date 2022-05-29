public class Main {
    public static void main(String[] args){
        NotificationFactory factory = new NotificationFactory();
        Notification pushNotification = factory.createNotification("push");
        pushNotification.notifyUser();
    }
}