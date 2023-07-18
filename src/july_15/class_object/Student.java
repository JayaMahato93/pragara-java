package july_15.class_object;

public class Student {
    String firstName = "Mike";
    int age = 23;
    double mark = 40;
    int id = 101;
    public void sum(int num1,int num2){
        int sum = num1 + num2;
        System.out.println(sum);
    }
    public void writing(){
        System.out.println("Student is writing: ");
    }
   public void lazy(){
       System.out.println("This student is very lazy: ");
    }
    public void study(){
        System.out.println("Student is study: ");

    }
}
