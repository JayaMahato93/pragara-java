package august_12.abstractdemo.phone;

public class Samsung extends Mobile {

    @Override
    public void size() {
        System.out.println("Screen size of the Phone is 16");
    }

    @Override
    public void camera() {
        System.out.println("Camera is 120");

    }

    @Override
    public void storage() {
        System.out.println("Storage is 1TB");

    }
}
