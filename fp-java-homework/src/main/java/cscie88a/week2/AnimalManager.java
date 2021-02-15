package cscie88a.week2;

public class AnimalManager {

	public AnimalManager() {
	}

	public static ActionResult trainForTricks(ITrainable animalToTrain, String trickName) {
		return animalToTrain.doTrick(trickName);
	}
	
	public static ActionResult setupPlaydate(AbstractAnimal hostAnimal, AbstractAnimal friend) {		
		return hostAnimal.playWithMe(friend);
	}

	public static ActionResult trainForSuperTricks(ITrainable animalToTrain, String trickName) {
		ActionResult response = animalToTrain.doSuperTrick(trickName);
		return response;

	}

}
