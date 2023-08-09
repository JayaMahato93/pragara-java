package augst_8.poly;

public class Main {
    public static void main(String[] args) {
        Animal animal =new Dog("Dog barks");
        System.out.println(animal.makesound());
        Cat animal1 = new Cat("Cat meow");
        System.out.println(animal1.makesound());
    }
}
