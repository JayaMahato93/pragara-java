package assigment_interface.animals;

public  class Lion implements  Animal_Basic_Behaviour  {


    @Override
    public void feed() {
        System.out.println("Eat Meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion Roaring");
    }
}
