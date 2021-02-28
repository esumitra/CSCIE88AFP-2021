package cscie88a.week6.hw;

import java.util.Random;
import java.util.stream.Stream;

public class AnimalGenerator {

    public static Random random = new Random();

    public static Stream<StreamAnimal> generateStreamOfAnimalsFromCollection(int numberOfItems){
        // TODO implement this and return a correct object
        // use can use 'random' to get random booleans, integers, itc
        boolean newRandomValue = random.nextBoolean();
        int newIntValue = random.nextInt();
        // TODO
        return null;
    }

    public static StreamAnimal getNewAnimal(){
        // TODO implement this and return a correct object
        // use can use 'random' to get random booleans, integers, itc
        boolean newRandomValue = random.nextBoolean();
        int newIntValue = random.nextInt();
        // TODO
        return null;
    }

    public static Stream<StreamAnimal> generateStreamOfAnimals_lambda(){
        // TODO implement this and return a correct object
        return null;
    }

    public static Stream<StreamAnimal> generateStreamOfAnimals_methodRef(){
        // TODO implement this and return a correct object
        return null;
    }

}
