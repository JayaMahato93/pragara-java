package assigment_interface.notification_Sender;

public class Mobile implements EmailNotification,SMSNotification,PushNotification {
    @Override
    public void setting_recipient() {
        System.out.println("Recipient");
    }

    @Override
    public void sending_email_notifications() {
        System.out.println(sendNotification("Email notifications"));
    }

    @Override
    public void sending_push_notification() {
        System.out.println(sendNotification("Push notification"));
    }

    @Override
    public void specifying_phone_numbers() {
        System.out.println("Specifying phone numbers");
    }

    @Override
    public void sending_SMS_notifications() {
        System.out.println(sendNotification("SMS notifications"));
    }

    @Override
    public String sendNotification(String message) {
        return message;
    }
}
