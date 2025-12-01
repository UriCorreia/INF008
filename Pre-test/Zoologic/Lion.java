public class Lion extends Animal{

    public Lion(String name, int age){
        super(name, age);
    }

    @Override
    public void emitSound(){
        System.out.println(name + " is a Lion: ROOAAAR!\n");
    }
}