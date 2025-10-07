import java.util.Scanner;

public class Reader {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String fullName = null;
        String firstName = null;
        int age = 0;

        // System.out.println("Type your full name: ");
        // fullName = scan.nextLine();
        // System.out.println("Your full name is: " + fullName);

        // System.out.println("Type your first name: ");
        // firstName = scan.next();
        // system.out.println("Your first name is: " + firstName);

        System.out.println("What's your years old? ");
        age = scan.nextInt();
        System.out.println("Your age is: " + age);
        
    } 
}