package augst_1;

class DateDemoTest {
    private int day ;
    private  int month;
    private int year;

    DateDemoTest(){
        day =1;
        month =8;
        year =2023;

    }



    public  void  printDate(){
    System.out.println("Date: "+day+"/"+month+"/"+year);
}
        }

public class DateDemo {
    public static void main(String[] args) {
        DateDemoTest dateDemo = new DateDemoTest();
        dateDemo.printDate();


    }
}
