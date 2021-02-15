package cscie88a.week2;

public class Cat extends AbstractAnimal implements ITrainable{

	public static String whatISay = "I don't care what you asked me to say - I say MEOW only";
	public static String humanGreeting = "Go away ...";	
	protected boolean isFriendly = false;
//	public boolean withTreat = false;
//
	public Cat() {}

	public Cat(String name, String eyeColor, String bodyColor) {
		super(name, eyeColor, bodyColor);
	}

	@Override
	public ActionResult doTrick(String trickName) {
		System.out.println(name + " says: cats do NOT do tricks ");
		return ActionResult.FAILURE;
	}

	@Override
	public ActionResult doTrickForTreat(String trickName, String treatName) {
		System.out.println(name + " says: cats do NOT do tricks ");
		return ActionResult.FAILURE;		
	}

	@Override
	public ActionResult playWithToy(Toy toy) {
		if (toy.isSqueaky()) {
			System.out.println("Looks like a mouse... I'll play");
			System.out.println(Toy.doFunStuff());
			return ActionResult.SUCCESS;
		}
		else {
			System.out.println("Don't feel like playing");
			return ActionResult.FAILURE;
		}


	}

//	@Override
//	public ActionResult takeMedicine(AbstractAnimal withTreat) {
//		return null;
//	}

	public static String saySomething(String somethingToSay){
		return whatISay;
	}

	@Override
	public void sayHiToHuman(String humanName) {
		System.out.println(name + " says: " + humanGreeting);
	}	

	@Override
	public ActionResult playWithMe(AbstractAnimal aFriend) {
		// I'll play only if I'm in the mood ...
		if (isFriendly) {
			System.out.println(name + " says: I'm playing with " + aFriend.getName());
			return ActionResult.SUCCESS;
		} else {
			System.out.println(name + " says: I'm NOT playing with " + aFriend.getName());
			return ActionResult.FAILURE;
		}
	}

	@Override
	public ActionResult takeMedicine(boolean withTreat) {
		if (withTreat) {
			return ActionResult.SUCCESS;
		} else {
			return ActionResult.FAILURE;
		}
	}


//	 //this method is overwritten !
//	public boolean takeMedicine(boolean withTreat) {
//		System.out.println(name + " says: you won't trick me - I'm not taking it!");
//		return false;
//	}

	
	public static void main(String[] args) throws Exception {
		Cat demon = new Cat("Demon", "green", "black");
		Cat sneaky = new Cat("Sneaky", "blue", "gray");
		String somethingToSay = "Hello!";
		System.out.println("Demon says: " + demon.saySomething(somethingToSay));
		System.out.println("Sneaky says: " + sneaky.saySomething(somethingToSay));
		
		System.out.println("All cats say: " + Cat.saySomething(somethingToSay));
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", eyeColor=" + eyeColor + ", bodyColor=" + bodyColor + "]";
	}

	public boolean isFriendly() {
		return isFriendly;
	}

	public void setFriendly(boolean isFriendly) {
		this.isFriendly = isFriendly;
	}

//	public boolean withTreat() {
//		return withTreat;
//	}
//
//	public void setTreat(boolean withTreat){
//		this.withTreat = withTreat;
//	}

}
