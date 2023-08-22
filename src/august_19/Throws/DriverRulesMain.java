package august_19.Throws;

public class DriverRulesMain {
    public static void main(String[] args) throws UnderAgeForDriving{
        DriverRules driverRules = new DriverRules();
        String name = "Mike";
        System.out.println("Name:"+name);

     int age = driverRules.age(17);
        System.out.println("Age:"+age);



    }
}
