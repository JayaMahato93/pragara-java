package augst_8;

public class Computer {
    private String model;
    private  String color;

    public Computer(String model, String color) {
        this.model = model;
        this.color = color;
    }
    public  void  computerDetails(){
        System.out.println("Computer Details: "+model);
        System.out.println("Computer Details: "+color);
    }
}
