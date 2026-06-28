// Program to demonstrate Interface and Runtime Polymorphism

// Interface
interface Notification {

    // Abstract method
    void send();
}

// Email Notification
class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Email Notification Sent.");
    }
}

// SMS Notification
class SMSNotification implements Notification {

    @Override
    public void send() {
        System.out.println("SMS Notification Sent.");
    }
}

// Push Notification
class PushNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Push Notification Sent.");
    }
}

// Main class
public class NotificationDemo {

    public static void main(String[] args) {

        // Interface reference
        Notification n;

        // Email Notification
        n = new EmailNotification();
        n.send();

        // SMS Notification
        n = new SMSNotification();
        n.send();

        // Push Notification
        n = new PushNotification();
        n.send();
    }
}