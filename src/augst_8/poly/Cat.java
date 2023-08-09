package augst_8.poly;

public class Cat extends Animal{
    public String cat_meow;

    public Cat(String cat_meow) {
        this.cat_meow = cat_meow;
    }

    @Override
    public String makesound() {
        return cat_meow;
    }
}
