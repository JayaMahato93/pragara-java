package augst_8.poly;

public class Dog extends Animal {
   private String dog_barks;

    public Dog(String dog_barks) {
        this.dog_barks = dog_barks;
    }

    public String makesound(){
        return  dog_barks;
    }
}
