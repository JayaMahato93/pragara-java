package august_15.ananomusClass;

public class Tree {
    public static void main(String[] args) {
        Funiture funiture = new Funiture() {
            @Override
            public void sit() {
                System.out.println("you can sit on a chair ");
            }

            @Override
            public void stand() {

            }

            @Override
            public void nothing() {

            }
        };
        funiture.sit();
        funiture.stand();
        funiture.nothing();


    }
}
