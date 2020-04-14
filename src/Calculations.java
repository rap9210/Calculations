import java.util.Scanner;
public class Calculations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number:");
        int first = input.nextInt();
        System.out.println("Now enter a second number:");
        int second = input.nextInt();
        System.out.println(first+"+"+second+"="+(first+second));
        System.out.println(first+"x"+second+"="+(first*second));
        System.out.println(first+"^"+second+"="+(Math.pow(first, second)));

        Scanner input_2 = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first_name = input_2.nextLine();
        System.out.println("Enter your last name: ");
        String last_name = input_2.nextLine();
        System.out.println("Your full name is "+first_name+" "+last_name);
    }
}
