class Notification {
    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Sending notification...");
    }
}

class EmailNotification extends Notification {

    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("Email sent to " + recipientName +
                " : " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("SMS sent to " + recipientName +
                " : " + message);
    }
}

class PushNotification extends Notification {

    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName +
                " : " + message);
    }
}

public class SmartNotificationSystem {
    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Sahil", "Your order has been shipped."),
                new SMSNotification("Rahul", "Your OTP is 123456."),
                new PushNotification("Priya", "New offer available!"),
                new EmailNotification("Amit", "Meeting scheduled at 3 PM.")
        };

        System.out.println("All Sent Notifications:\n");

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}