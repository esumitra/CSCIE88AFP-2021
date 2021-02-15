package cscie88a.week2;

import javax.swing.*;

public class Dog extends AbstractAnimal implements ITrainable{

	public Dog() {
	}
	public static String doFunStuff = Toy.doFunStuff();
	public Dog(String name, String eyeColor, String bodyColor) {
		super(name, eyeColor, bodyColor);
	}

	@Override
	public void sayHiToHuman(String humanName) {
		System.out.println(name + " says: Hi, " + humanName + "!!! I LOVE you!");
	}

	@Override
	public ActionResult playWithMe(AbstractAnimal aFriend) {
		// I am happy to play with anyone!
		System.out.println(name + " says: I'm playing with " + aFriend.getName());
		return ActionResult.SUCCESS;
	}

	@Override
	public ActionResult playWithToy(Toy toy) {
		System.out.println(Toy.doFunStuff());
		return ActionResult.SUCCESS;
	}

	@Override
	public ActionResult takeMedicine(boolean withTreat) {
		if (withTreat) {
			return ActionResult.SUCCESS;
		} else {
			return ActionResult.FAILURE;
		}
	}

//	@Override
//	public ActionResult takeMedicine(boolean withTreat) {
//		 return ActionResult.SUCCESS;
//	}

	@Override
	public ActionResult doTrick(String trickName) {
		System.out.println(name + " says: I LOVE doing tricks! I'm doing " + trickName + " now!");
		return ActionResult.SUCCESS;
	}



}
