package chall_1;

public class BankAccount {

    private int AccountNumber;
    private String AccountHolder;
    private double AccountBalance;


    // Construtores
    public BankAccount (int AccountNumber, String AccountHolder) {
        this.AccountNumber = AccountNumber;
        this.AccountHolder = AccountHolder;
        this.AccountBalance = 0.0;
    } 

    // Métodos
    public boolean deposite (double value) {
        if (value <= 0 ) return false;
        else{
            this.AccountBalance += value;
            return true;
        }
    }

    public boolean withdraw (double value){
        if (value <= 0 || value > this.AccountBalance) return false;
        else{
            this.AccountBalance -= value;
            return true;
        }
    }

    public String ShowDates (){
        StringBuilder report = new StringBuilder();

        report.append("Account Number: ").append(this.AccountNumber).append("\n");
        report.append("Account Holder: ").append(this.AccountHolder).append("\n");
        report.append("Account Balance: ").append(this.AccountBalance).append("\n");
        
        return report.toString();
    }

    // Getters
    public double getBalance(){
        return this.AccountBalance;
    }

}