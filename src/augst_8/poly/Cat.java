package augst_8.poly;

public class Cat extends Animal{
    private String cat_meow;

    public Cat(String cat_meow) {
        this.cat_meow = cat_meow;
    }

    public String makesound(){
        return  cat_meow;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
