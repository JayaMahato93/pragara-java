package july4;

public class LeapYear {
    public static void main(String[] args) {
        int yearx= 2012;
        int yeary= 2016;
        if (yearx%4==0){
            System.out.println("Year X is leap year :"+yearx);
        }
        if (yeary%4==0){
            System.out.println("Year Y is leap year :"+yeary);
        }
            else{
            System.out.println("This year is not a leap year");
        }
    }
}
