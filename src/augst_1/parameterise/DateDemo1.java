package augst_1.parameterise;


class DateDemoTest1 {
    private int day ;
    private  int month ;
    private int year ;

    DateDemoTest1(){
        day = 1;
        month = 8;
        year = 2023;

    }

    public DateDemoTest1(int day) {
        this.day = day;
    }

    public DateDemoTest1(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public DateDemoTest1(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public  void  printDate(){
        System.out.println("Date: "+day+"/"+month+"/"+year);
    }
}

public class DateDemo1 {
    public static void main(String[] args) {



        DateDemoTest1 dateDemo = new DateDemoTest1();
        dateDemo.printDate();

        DateDemoTest1 dateDemo1 = new DateDemoTest1(10);
        dateDemo1.printDate();

        DateDemoTest1 dateDemo2 = new DateDemoTest1(10, 8 );
        dateDemo2.printDate();

        DateDemoTest1 dateDemo3 = new DateDemoTest1(10, 8,2023 );
        dateDemo3.printDate();
    }
}

