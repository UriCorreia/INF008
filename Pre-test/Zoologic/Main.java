import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){

        List<Animal> listZoo = new ArrayList<>();

        listZoo.add(new Dog("Lady", 7));
        listZoo.add(new Lion("Mufasa", 10));
        listZoo.add(new Dolphin("Acqua", 3));

        for(Animal a : listZoo){
            System.out.println("Name: " + a.name);
        }
    }
}