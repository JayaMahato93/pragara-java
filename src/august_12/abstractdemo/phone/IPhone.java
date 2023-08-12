package august_12.abstractdemo.phone;

public class IPhone extends Mobile {

    @Override
    public void size() {
        System.out.println("Screen size of the Phone is 12");
    }

    @Override
    public void camera() {
        System.out.println("Camera is 150");

    }

    @Override
    public void storage() {
        System.out.println("Storage is 1TB");

    }
}
