package cscie88a.week3_fp;

public class AnimalManagerFP {

    // one-argument method
    public static ActionResult trainToRun(ITrainableFP animalToTrain) {
        String trickName = "run";
        System.out.println("About to ask subject [" + animalToTrain.toString() + "] to run ...");
        return animalToTrain.doTrick(trickName);
    }

    // multi-argument method
    public static ActionResult trainForTricks(ITrainableFP animalToTrain, String trickName) {
        System.out.println("About to ask subject [" + animalToTrain.toString() +
                "] to do the trick: " + trickName);
        return animalToTrain.doTrick(trickName);
    }

    // use FI with no arguments and no return value
    public static ActionResult doAnyTrick1(ITrainable1 animalToTrain) {
        animalToTrain.doAnyTrick();
        return ActionResult.SUCCESS;
    }

    // use FI with a return value
    public static ActionResult doAnyTrick2(ITrainable2 animalToTrain) {
        return animalToTrain.doAnyTrick();
    }

    // use FI with multiple arguments
    public static ActionResult doManyTricks(ITrainable3 animalToTrain) {
        return animalToTrain.doManyTricks("jump", "roll");
    }

    // use FI with multiple arguments
    public static ActionResult doManyTricksWith4(ITrainable4 animalToTrain) {
        return animalToTrain.myNewMethod("jump", "roll");
    }

}
