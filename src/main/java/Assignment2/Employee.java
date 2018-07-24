package Assignment2;

import Assignment4.Exception1;
import Assignment4.Exception2;

import java.util.ArrayList;

public class Employee {

    private String name;
    private int age;
    private String department;
    private String jobDescription;
    private long SIN;
    private int salary;

    private ArrayList<Long> SINs = new ArrayList<Long>();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", SIN=" + SIN +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int hashCode() {
        int x = age; long y = SIN; int z = super.hashCode();
        long hashCode = ((x + y) * y) * (x + z) / y;
        return (int)hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        if(this.SIN == employee.SIN)
            return true;
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee clonedObject = new Employee();
        clonedObject.name = this.name;
        clonedObject.age = this.age;
        clonedObject.department = this.department;
        clonedObject.jobDescription = this.jobDescription;
        clonedObject.SIN = this.SIN;
        clonedObject.salary = this.salary;

        return clonedObject;
    }

    public void calculateTax(double tax) throws Exception1{

        if(tax > .22){
            throw new Exception1("tax is more that 0.22");
        }

        System.out.println(this.SIN + " salary with tax: " + salary * tax);

    }

    public void calculateInsurance(long SIN) throws Exception2{

        if(!(SINs.contains(SIN))){
            throw new Exception2("SIN number is not on list");
        }
        System.out.println(this.SIN + " insurance: " + ((salary * 0.45) - 12));

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setSIN(long SIN) {
        this.SIN = SIN;
        SINs.add(SIN);

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public long getSIN() {
        return SIN;
    }

    public int getSalary() {
        return salary;
    }
}
