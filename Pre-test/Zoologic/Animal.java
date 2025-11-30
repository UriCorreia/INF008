public abstract class Animal{

    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void emitSound();

    public void sleep(String name){
        System.out.println("\n" + name + "Is sleeping zzz...\n");
    }
}