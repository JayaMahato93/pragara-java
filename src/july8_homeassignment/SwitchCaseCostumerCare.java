package july8_homeassignment;

import java.util.Date;
import java.util.Scanner;

public class SwitchCaseCostumerCare {
    public static void main(String[] args) {
        System.out.println("Welcome to the CostumerCare");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Account Number");
        int account_number = scanner.nextInt();
        System.out.println("Press 1 for Account update\n 2 for Technical support\n 3 for ticket inquire\n 4 to speak to customer care  ");
        int value_step1 =scanner.nextInt();
        switch (value_step1) {
            case (1):
                System.out.println("Press 1 for Current Bill\n 2 for Technical support\n 3 to speak to agent  ");
                int value_billing_step2 = scanner.nextInt();
                switch (value_billing_step2) {
                    case 1 :
                        System.out.println("your Account Balance "+account_number+"1234");
                        break;
                    case 2:
                        System.out.println("Last payment for Account "+account_number+"1234");
                        break;
                    case 3:
                        System.out.println("Press 'A' to connect with billing agent\n Press 'C' for call back");
                        char callback = scanner.next().charAt(0);
                        switch (callback){
                            case 'A':
                                System.out.println("Enter the call back number");
                                int callback_number = scanner.nextInt();
                                System.out.println("Agent will be connect you soon");
                                break;
                            case'C':
                                System.out.println("Our agent will call you back");
                                break;
                            default:
                                System.err.println("Invalid entry, please try again !");
                        }
                        break;
                }
                break;
            case (2):
                System.out.println("Press 1 for Register problem\n 2 for BookThe Appointment\n 3 to speak to the technician");
                int value_tech_support_step3 = scanner.nextInt();
                switch (value_tech_support_step3){
                    case 1:
                        System.out.println("Register problem in your Account number "+account_number);
                        break;
                    case 2: System.out.println("Give your prefer time and date");
                        String date= scanner.next();
                        System.out.println("Book a Date "+date);
                    case 3:
                        System.out.println("Press 'T' to connect with technician\n Press 'B' to book time with technician");
                        char call_back_book_time =scanner.next().charAt(0);
                        switch(call_back_book_time){
                            case 'T':
                                System.out.println("Wait for The Technician ");
                                break;
                            case 'F':
                                System.out.println(" Your time with technician will be booked  ");
                                break;
                            default:
                                System.err.println("Invalid entry, please try again !");
                        }
                        break;
                }
                break;
            case (3):
                System.out.println("Press 1 for tack Ticket Inquire\n 2 to speak to the agent");
                int value_ticket_inquire_step4 = scanner.nextInt();
                switch (value_ticket_inquire_step4 ){
                    case 1:
                        System.out.println("put tacking number");
                        int tracking_number =scanner.nextInt();
                        System.out.println("work in progress");
                        break;
                    case 2:
                        System.out.println("agent will be connect you soon");
                        break;
                    default:
                        System.err.println("Invalid entry, please try again !");
                }
                break;
            case(4):
                System.out.println("Speak to customer care");
                System.out.println("Press 1 for English");
                System.out.println("Press 2 for Hindi");
                System.out.println("Press 3 for French");
                System.out.println("Press 4 for Invalid");

                System.out.println("Enter your values");
                int input = scanner.nextInt();
                switch (input){
                    case 1 :
                        System.out.println("English");
                        break;
                    case 2:
                        System.out.println("Hindi");
                        break;
                    case 3:
                        System.out.println("French");
                        break;
                    default:
                        System.err.println("Invalid entry, please try again !");
                }
                break;
        }
    }
}

