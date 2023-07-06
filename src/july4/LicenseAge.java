package july4;

public class LicenseAge {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 16 && age <18){
            System.out.println("Take learner exam");
        }else if (age >= 18) {
            System.out.println("Eligible to drive");
        }else if (age < 16){
            System.out.println("Can't Drive");
        }else {
            System.out.println("Invalid");
        }
    }
}
