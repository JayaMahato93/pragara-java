package augst_8.poly;

public class Dog extends Animal {
   public String dog_barks;

    public Dog(String dog_barks) {
        this.dog_barks = dog_barks;
    }

    @Override
    public String makesound() {
        return dog_barks;
    }
}
