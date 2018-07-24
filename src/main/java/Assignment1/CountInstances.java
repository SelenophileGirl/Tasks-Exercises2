package Assignment1;

public class CountInstances {

    private String name;
    private int age;
    private static int instancesCount;

    public static void main(String[] args) {

        CountInstances firstObject = new CountInstances("Eman" , 22);
        System.out.println("creating new object");
        System.out.println("number of instances: "+ getInstancesCount());
        CountInstances secondObject = new CountInstances("Ola" , 26);
        System.out.println("creating new object");
        System.out.println("number of instances: " + getInstancesCount());
    }

    public CountInstances(String name , int age){
        this.name = name;
        this.age = age;
        instancesCount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getInstancesCount() {
        return instancesCount;
    }

}
