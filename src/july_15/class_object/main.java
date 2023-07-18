package july_15.class_object;

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.type= "Mammal";
        System.out.println(animal.type);
        animal.ear = 2;
        System.out.println(animal.ear);
        animal.leg = 4;
        System.out.println(animal.leg);
        animal.eat();
        animal.run();
        animal.sleep();


    }
}
