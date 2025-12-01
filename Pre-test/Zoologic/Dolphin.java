public class Dolphin extends Animal implements Treinable{

    public Dolphin(String name, int age){
        super(name, age);
    }

    @Override
    public void emitSound(){
        System.out.println(name + " is a Dolphin: Click-Click!\n");
    }

    @Override
    public void performTrick(){
        System.out.println(name + " Jumped very high in the water!\n");
    }
}