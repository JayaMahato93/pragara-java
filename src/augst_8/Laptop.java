package augst_8;

public class Laptop extends  Computer{
    private  int screenSize;

    public Laptop(String model, String color, int screenSize) {
        super(model, color);
        this.screenSize = screenSize;
    }

    public  void  printDetails(){

        System.out.println("Laptop Details: "+screenSize);
    }
}
