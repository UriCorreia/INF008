import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){

        List<Animal> listZoo = new ArrayList<>();

        listZoo.add(new Dog("Lady", 7));
        listZoo.add(new Lion("Mufasa", 10));
        listZoo.add(new Dolphin("Acqua", 3));

        for(Animal a : listZoo){
            //System.out.println("Name: " + a.name);
            a.emitSound();

            a.sleep();

            // O instanceof funciona como um verificador de uma variável genérica, verifica se essa variável genérica tbm é de uma determinada classe mais específica. 
            if(a instanceof Treinable){
                Treinable t = (Treinable) a;
                t.performTrick();
            }
        }
    }
}