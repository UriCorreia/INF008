public abstract class Animal{

    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void emitSound();

    public void sleep(){
        System.out.println(name + " Is sleeping zzz...\n");
    }
}