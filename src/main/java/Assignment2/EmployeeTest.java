package Assignment2;

import Assignment4.Exception1;
import Assignment4.Exception2;

public class EmployeeTest {

    public static void main(String[] args) throws Exception1, Exception2 {

        Employee me = new Employee();
        me.setName("Eman");
        me.setAge(22);
        me.setDepartment("SWE");
        me.setJobDescription("developer");
        me.setSIN(996265154);
        me.setSalary(150);

        Employee anotherMe = new Employee();
        try{

            anotherMe = (Employee) me.clone();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.print("me Object: ");System.out.println(me.toString());
        System.out.print("another me Object ");System.out.println(anotherMe.toString());
        System.out.println("me == another me : " + me.equals(anotherMe));

        Employee her = new Employee();
        her.setName("Ola");
        her.setAge(26);
        her.setDepartment("English");
        her.setJobDescription("social media");
        her.setSIN(999265896);
        her.setSalary(600);

        System.out.println(me.hashCode());
        System.out.println(her.hashCode());

        System.gc();

        me.calculateTax(0.16);
        try{
        her.calculateTax(.26);//throws Exception
        }catch(Exception1 e){
            System.out.println(e.getMessage());
        }

        me.calculateInsurance(me.getSIN());
        try {
            her.calculateInsurance(996524118);//throws Exception
        }catch(Exception2 e){
            System.out.println(e.getMessage());
        }


    }
}
