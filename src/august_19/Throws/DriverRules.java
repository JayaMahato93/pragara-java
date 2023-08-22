package august_19.Throws;

public class DriverRules {

public  int age (int age) throws UnderAgeForDriving{
    if(age<18){
        throw new UnderAgeForDriving("Under Age For Driving");
    }
    return age;
}


    public  String name (String name){

    return name;
    }
}
