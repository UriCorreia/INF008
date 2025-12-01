public class Dog extends Animal implements Treinable{

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void emitSound(){
        System.out.println(name + " is a Dog: AU AU AU!\n");
    }

    @Override
    public void performTrick(){
        System.out.println(name + " Jumped!\n");
    }
}