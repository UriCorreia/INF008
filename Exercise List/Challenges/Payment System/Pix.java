public class Pix implements PaymentMetod{
    public void pay(double value){
        System.out.println("Payment of " + value + " was made by Pix");
    }
}