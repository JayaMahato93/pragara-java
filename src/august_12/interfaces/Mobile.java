package august_12.interfaces;

public class Mobile implements Computer,Camera,Telephone {
    @Override
    public void takePic() {
        System.out.println("Click pics");
    }

    @Override
    public void shootvideo() {
        System.out.println("Shooting video");

    }

    @Override
    public void calculator() {
        System.out.println("Calculating");

    }

    @Override
    public void surffing() {
        System.out.println("Surfing Internet");
    }

    @Override
    public void makeCall() {
        System.out.println("Make Call");
    }

    @Override
    public void reciveCall() {
        System.out.println("Recive Call");
    }
}
