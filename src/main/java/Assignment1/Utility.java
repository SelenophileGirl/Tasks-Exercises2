package Assignment1;

public class Utility {

    public static void main(String[] args) {

        String s = "This is a string to count the occurrences of the and a substrings!";
        System.out.println(s);
        Utility.counting(s);
        Utility.isPalindrome("level");
        Utility.isArmstrong(153);
    }

    public static void counting(String str){

        int aCounter = 0;
        int theCounter = 0;
        String[] string = str.split(" ");
        for(String s : string){
            if(s.equalsIgnoreCase("the"))
                theCounter++;
            if(s.equalsIgnoreCase("a"))
                aCounter++;
        }

        System.out.println("the occurrences: " + theCounter);
        System.out.println("a occurrences: " + aCounter);

    }

    public static boolean isPalindrome(String str){

        if (str.equals(new StringBuilder(str).reverse().toString())){
            System.out.println(str + " Palindrome");
            return true;
        }
        return false;

    }

    public static boolean isArmstrong(int i){

        int sum = 0;
        for(int j = i; j>0 ; j = j/10){
            sum = sum + ((j%10)*(j%10)*(j%10));
        }
        if(sum == i){
            System.out.println(i + " Armstrong");
            return true;
        }
        else{
            System.out.println(i + " Not Armstrong");
            return false;
        }

    }

}
