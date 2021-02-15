package cscie88a.week2;

public class Hedgehog extends AbstractAnimal implements ITrainable{

    public Hedgehog() {
    }

    public static String doFunStuff = Toy.doFunStuff();
    public Hedgehog(String name, String eyeColor, String bodyColor) {
        super(name, eyeColor, bodyColor);
    }

    @Override
    public void sayHiToHuman(String humanName) {
        System.out.println(name + " says: Hi, " + humanName + "!!! I LOVE you!");
    }

    @Override
    public ActionResult playWithMe(AbstractAnimal aFriend) {
        // I do not play!
        System.out.println(name + " says: I'm NOT playing with " + aFriend.getName());
        return ActionResult.FAILURE;
    }

    @Override
    public ActionResult playWithToy(Toy toy) {
        System.out.println(name + " says: I do not play!");
        return ActionResult.FAILURE;
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
        System.out.println(name + " says: I do not do tricks!");
        return ActionResult.FAILURE;
    }


}
