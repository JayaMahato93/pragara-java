package assigment_interface.notification_Sender;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.setting_recipient();
        mobile.sending_push_notification();
        mobile.sending_email_notifications();
        mobile.sending_SMS_notifications();
        mobile.specifying_phone_numbers();

    }
}
