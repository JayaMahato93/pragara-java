package assigment_interface.animals;

public class Monkey implements  Animal_Basic_Behaviour,Climb{
    @Override
    public void feed() {
        System.out.println("Eating Banana");
    }

    @Override
    public void makeSound() {
        System.out.println("Laughing");
    }

    @Override
    public void climb() {
        System.out.println("Climbing Tree");
    }
}
