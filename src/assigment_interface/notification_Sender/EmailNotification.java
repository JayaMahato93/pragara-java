package assigment_interface.notification_Sender;

public interface EmailNotification extends NotificationSender {
    void setting_recipient();
    void sending_email_notifications();
}
