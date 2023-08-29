package august_26.lamda;

import august_26.functionInterFace.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = () -> System.out.println("Welcome to your account");
        bank.account();

    }
}
