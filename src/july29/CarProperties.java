package july29;

class CarDetail {

   private String brand;
    private int engin_type;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand= brand;
    }

    public int getEngin_type() {
        return engin_type;
    }

    public void setEngin_type(int engin_type) {
        this.engin_type = engin_type;
    }
}

public class CarProperties {
    public static void main(String[] args) {
        CarDetail car = new CarDetail();
        car.setBrand("Tesla");
        System.out.println(car.getBrand());
        car.setEngin_type(4);
        System.out.println(car.getEngin_type());


    }
}
