public class Variable {

    public static void main(String[] args){

        // As variáveis podem ser do tipo int, float, boolean e string

        int age = 0;
        String name = null;
        String dogName = null;


        // Se não inicializar as variáveis o arquivo não compila

        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Dog Name: " + dogName);

        age = 20;
        name = "Uriel";
        dogName = "Belinha";

        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Dog Name: " + dogName);
    }

}