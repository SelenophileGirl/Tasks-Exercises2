package Assignment1;

import static java.lang.Math.*;


public class MathClassMethods {

    public static void main(String[] args) {

        MathClassMethods  myObject = new MathClassMethods();
        System.out.println(myObject.myAbs(6));
        System.out.println(myObject.myCeil(2.3));
        System.out.println(myObject.myMax(20 , 8));
        System.out.println(myObject.power(6 , 3));
        System.out.println(myObject.getRandomNumber());
    }

    public int myAbs(int x){
        //return Math.abs(x);
        System.out.print("the absolute value of " + x + ": ");
        return abs(x);
    }

    public double myCeil(double x){
        //return Math.ceil(x);
        System.out.print("the ceil value of " + x + ": ");
        return ceil(x);
    }

    public int myMax(int x , int y){
        //return Math.max(x , y);
        System.out.print("the max value between " + x + " , " + y + " is: ");
        return max(x , y);
    }

    public double power(double x , double y ){
        //return Math.pow(x , y);
        System.out.print(x + " ^ " + y + " is: ");
        return pow(x , y);
    }

    public double getRandomNumber(){
        //return Math.random();
        System.out.print("my random number: ");
        return random();
    }
}
