package august_12.abstractdemo.phone;

public class Main {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.storage();
        samsung.camera();
        samsung.size();

        IPhone iPhone =new IPhone();
        iPhone.size();
        iPhone.camera();
        iPhone.storage();
    }
}
