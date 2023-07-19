package july18;

public class StaticVariable {
    int id ;
    String name;
    String course = "java";

    public StaticVariable(int id, String name) {
        this.id = id;
        this.name = name;

    }
    public void setvalue()
    {
        System.out.println(id +" " + name +" " +course);
    }

    public static void main(String[] args) {
        StaticVariable staticVariable = new StaticVariable(101,"Ajay");
        staticVariable.setvalue();
        StaticVariable staticVariable1 = new StaticVariable(102,"Jaya");
        staticVariable1.setvalue();
        StaticVariable staticVariable2 = new StaticVariable(103,"Dharuv");
        staticVariable2.setvalue();
        StaticVariable staticVariable3 = new StaticVariable(104,"Sudeep");
        staticVariable3.setvalue();





    }
}
