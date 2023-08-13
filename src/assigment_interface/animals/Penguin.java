package assigment_interface.animals;

public  class Penguin implements Swim{

    @Override
    public void swim() {
        System.out.println(" Penguin Swimming.");
    }

    @Override
    public void feed() {
        System.out.println("Eat Fish");
    }

    @Override
    public void makeSound() {
        System.out.println("");
    }
}
