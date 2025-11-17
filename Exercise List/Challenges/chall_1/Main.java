package chall_1;

public class Main {

    public static void main(String[] args){

        boolean verify = false;

        BankAccount MyAccount = new BankAccount(1234, "Uriel Correia");

        System.out.println(MyAccount.ShowDates());

        verify = MyAccount.deposite(500.00);
        if(verify){ 
            System.out.println("The deposit was successfully Completed!");
            verify = false;
        }

        System.out.println(MyAccount.ShowDates());

        verify = MyAccount.withdraw(1000.00);
        if(verify){
            System.out.println("The withdraw was successfully Completed!");
            verify = false;
        } else System.out.println("The withdraw wasn't successful!");

        System.out.println(MyAccount.ShowDates());

        verify = MyAccount.withdraw(200.00);
        if(verify){
            System.out.println("The withdraw was successfully Completed!");
            verify = false;
        } else System.out.println("The withdraw wasn't successful!");

        System.out.println(MyAccount.ShowDates());

    }
}