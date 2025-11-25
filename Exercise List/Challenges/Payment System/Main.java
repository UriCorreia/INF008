public class Main{
    public static void main(String[] args){

        Box purchase = new Box();
        PaymentMetod metod = new Pix();

        purchase.ProccessPurchase(metod, 30.00);

        metod = new CreditCard();

        purchase.ProccessPurchase(metod, 60.00);
    }
}