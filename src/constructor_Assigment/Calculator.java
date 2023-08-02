package constructor_Assigment;

import java.util.Scanner;

public class Calculator {
    private  double num1;
    private  double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double addNumbers(){

        return this.num1+this.num2;
    }

    public double substraction(){

        return this.num1-this.num2;
    }

    public double multiplication(){
        return this.num1*this.num2;
    }

    public double division(){
        return this.num1/this.num2;
    }

    public double modulus(){
        return this.num1%this.num2;
    }
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
