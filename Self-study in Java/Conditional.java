import java.util.Scanner;

public class Conditional {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // System.out.println("Type your age: ");
        // int age = scan.nextInt();

        // if(age >= 18){
        //     System.out.println("Is of legal age.");
        // } else {
        //     System.out.println("Isn't of legal age.");
        // }

        // Caso existam muitas condições, recomenda-se utilizar o switch case

        System.out.println("Type a number: ");
        int day = scan.nextInt();

        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid value!");
                break;
        }

    }
}