public class Whatsapp implements Messenger{
    @Override
    public void sent(String text){
        System.out.println("Enviando por Whatsapp: " + text);
    }
}