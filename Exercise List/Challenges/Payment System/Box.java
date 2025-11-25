public class Box{
    public void ProccessPurchase(PaymentMetod metod, double value){
        metod.pay(value);
    }
}