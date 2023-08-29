package august_26.functionInterFace;

public class Main {
    public static void main(String[] args) {
        Bank bank =new Bank() {
            @Override
            public void account() {
                System.out.println("Welcome to Your Account");
            }
        };
        bank.account();

    }
}
