package cscie88a.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllAnimalTests {

	private Cat sneaky;
	private Dog bolt;
	private Hedgehog spiky;
	private Toy ball;
	private Toy bird;

	@BeforeEach
	void setUp() throws Exception {
		sneaky = new Cat("Sneaky", "blue", "gray");
		bolt = new Dog("Bolt", "brown", "whity");
		spiky = new Hedgehog("Spiky", "brown", "brown");
		ball = new Toy(false, true, false);
		bird = new Toy(true, false, true);
	}




//	@Test
//	void testTakeMedicine() {
//		assertTrue(bolt.takeMedicine(true));
//		assertFalse(bolt.takeMedicine(false));
//		assertFalse(sneaky.takeMedicine(true));
//		assertFalse(sneaky.takeMedicine(false));
//	}
//
	@Test
	public void testTakeMedicine() {

		ActionResult result = sneaky.takeMedicine(true);
		assertEquals(ActionResult.SUCCESS, result);
		result = sneaky.takeMedicine(false);
		assertEquals(ActionResult.FAILURE, result);
		result = bolt.takeMedicine(true);
		assertEquals(ActionResult.SUCCESS, result);
		result = bolt.takeMedicine(false);
		assertEquals(ActionResult.FAILURE, result);
	}

	@Test
	public void testPlayWithToy() {

		ActionResult result = sneaky.playWithToy(ball);
		assertEquals(ActionResult.FAILURE, result);
		result = sneaky.playWithToy(bird);
		assertEquals(ActionResult.SUCCESS, result);
		result = bolt.playWithToy(ball);
		assertEquals(ActionResult.SUCCESS, result);
		result = bolt.playWithToy(bird);
		assertEquals(ActionResult.SUCCESS, result);
	}

	@Test
	public void testPlayWithMeForHedgehog() {

		ActionResult result = spiky.playWithMe(bolt);
		assertEquals(ActionResult.FAILURE, result);
		result = spiky.playWithMe(sneaky);
		assertEquals(ActionResult.FAILURE, result);
	}

	@Test
	public void testWhoAreYou() {
		String result = sneaky.whoAreYou();
		assertEquals("I am Sneaky!", result);
		result = bolt.whoAreYou();
		assertEquals("I am Bolt!", result);
	}

//
//		// a friendly cat will play with others
//		sneaky.setFriendly(true);
//		result = sneaky.playWithMe(bolt);
//		assertEquals(ActionResult.SUCCESS, result);
//
//		// dog will play with anybody, always
//		result = bolt.playWithMe(sneaky);
//		assertEquals(ActionResult.SUCCESS, result);
//	}
////}

	@Test
	public void testSayHi() {
		String humanName = "Marina";
		sneaky.sayHiToHuman(humanName);
		bolt.sayHiToHuman(humanName);
	}

	@Test
	public void testAbstractClassCreation() {
		// demo error creating AbstractAnimal directly
		// will NOT compile
		//AbstractAnimal unknownAnimal = new AbstractAnimal();
	}
	
	@Test
	public void testDoTrick() {
		ActionResult result = sneaky.doTrick("sit");
		assertEquals(ActionResult.FAILURE, result);

		result = bolt.doTrick("sit");
		assertEquals(ActionResult.SUCCESS, result);
	}

	@Test
	public void testDoTrickForTreat() {
		ActionResult result = sneaky.doTrickForTreat("sit", "yummyTreat");
		assertEquals(ActionResult.FAILURE, result);

		result = bolt.doTrickForTreat("sit", "yummyTreat");
		assertEquals(ActionResult.SUCCESS, result);
	}

	@Test 
	public void testPlayWithMe() {
		// unfriendly cat will not play with anyone
		sneaky.setFriendly(false);
		ActionResult result = sneaky.playWithMe(bolt);
		assertEquals(ActionResult.FAILURE, result);
		
		// a friendly cat will play with others
		sneaky.setFriendly(true);
		result = sneaky.playWithMe(bolt);
		assertEquals(ActionResult.SUCCESS, result);
		
		// dog will play with anybody, always
		result = bolt.playWithMe(sneaky);
		assertEquals(ActionResult.SUCCESS, result);
	}
}
