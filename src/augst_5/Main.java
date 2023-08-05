package augst_5;

import july25.Student;

class School{
    String nameOfTheSchool;
    int  numbOfStudent;
    int nubOfClasses;
    public void display(){
        System.out.println("Name of The School :" + nubOfClasses );
        System.out.println("Numb of Student :" + numbOfStudent );
        System.out.println("Numb of Classes :" + nubOfClasses);
    }
}
     class FirstStudent extends School{
        String name;
        int id;
        public  void display2(){
            System.out.println("Name of The Student:" + name);
            System.out.println("Student Id: "+id);
        }
    }


public class Main {
    public static void main(String[] args) {

        FirstStudent student = new FirstStudent() ;
          student.display();

    }
}
