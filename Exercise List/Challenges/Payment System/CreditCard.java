public class CreditCard implements PaymentMetod{
    public void pay(double value) {
        System.out.println("Payment of " + value + " was made by credit card in 3 installments.");
    }
}