public class Main{
    public static void main(String[] args){
    
        Messenger user;

        user = new Email();
        user.sent("Test message in Email!");

        user = new Whatsapp();
        user.sent("Teste message in Whatsapp!");
    }
}