package Assignment3;

import java.util.ArrayList;

public class Wrappers<T> {

    T[] myArray;

    public static void main(String[] args) {

        //new array can be of any type
        Double[] doubles = new Double[]{0.34, 0.3434, .345345, 0.34534};
        Wrappers<Double> objectOne = new Wrappers<Double>(doubles);

        //printing the array
        objectOne.printArraySimpleFormatOne();

        //boxing
        Integer one = new Integer(5);
        Integer two = new Integer(6);//constructor boxing
        System.out.println("printing Integer");
        printPrimitiveValue(one);

        System.out.println("printing int");
        printPrimitiveValue(88);

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("printing Integer list objects");
        list.add(one);
        list.add(two);
        list.add(9);
        for (Integer i : list) {
            printPrimitiveValue(i);
        }
    }

    //having a class that uses generic, make us use wrappers

    Wrappers(T[] object) {
        this.myArray = object;
    }

    public void printArraySimpleFormatOne() {
        String out = "{";
        for (T temp : myArray) {
            out = out + temp + ",";
        }
        out = out.substring(0, out.length() - 1);
        out = out + "}";
        System.out.println(out);

    }


    public static void printPrimitiveValue(Integer o){

        System.out.print(o + "  ");
        System.out.println(o.intValue());//unboxing


    }


}
