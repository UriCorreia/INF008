public class Email implements Messenger{
    @Override
    public void sent(String text){
        System.out.println("Enviando por E-mail: " + text);
    }
}