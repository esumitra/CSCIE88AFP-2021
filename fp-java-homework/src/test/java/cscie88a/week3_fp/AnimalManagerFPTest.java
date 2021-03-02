package cscie88a.week3_fp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalManagerFPTest {

	/**
	 * the regular implementation way
	 */
	@Test
	public void testTrainToRun_concrete(){
		CatFP sneaky = new CatFP("Sneaky");
		ActionResult result = AnimalManagerFP.trainToRun(sneaky);
		assertEquals(ActionResult.FAILURE, result);
	}

	/**
	 * the anonymous class way
	 */
	@Test
	public void testTrainToRun_anonymous(){
		ActionResult result = AnimalManagerFP.trainToRun(
				new ITrainableFP() {
					@Override
					public ActionResult doTrick(String trickName) {
						System.out.println("I hate running!");
						return ActionResult.FAILURE;
					}
				}
		);
		assertEquals(ActionResult.FAILURE, result);
	}

	/**
	 * the first Lambda function - as an implementation of the ITrainableFP interface;
	 * as close to the class syntax as possible
	 */
	@Test
	public void testTrainToRun_lambda1(){
		ActionResult result = AnimalManagerFP.trainToRun(
				(String trickName) -> {
						System.out.println("I hate running!");
						return ActionResult.FAILURE;
				}
		);
		assertEquals(ActionResult.FAILURE, result);
	}

	/**
	 * the first Lambda function - as an implementation of the ITrainableFP interface;
	 * simplifying syntax: omitting brackets and type for a single method argument
	 */
	@Test
	public void testTrainToRun_lambda2(){
		ActionResult result = AnimalManagerFP.trainToRun(
				trickName -> {
					System.out.println("I hate running!");
					return ActionResult.FAILURE;
				}
		);
		assertEquals(ActionResult.FAILURE, result);
	}

	/**
	 * the first Lambda function - as an implementation of the ITrainableFP interface;
	 * simplifying syntax: one line body
	 */
	@Test
	public void testTrainToRun_lambda3(){
		ActionResult result = AnimalManagerFP.trainToRun(
				trickName -> ActionResult.FAILURE
		);
		assertEquals(ActionResult.FAILURE, result);
	}

	/**
	 * Lambda function implementing ITrainable1 interface -
	 * with no arguments and no return value;
	 * no action in the body
	 */
	@Test
	public void testDoAnyTrick1_doNothing(){
		ActionResult result = AnimalManagerFP.doAnyTrick1(
				() -> { }
		);
		assertEquals(ActionResult.SUCCESS, result);
	}

	/**
	 * Lambda function implementing ITrainable2 interface -
	 * with no arguments but with a return value
	 */
	@Test
	public void testDoAnyTrick2(){
		ActionResult result = AnimalManagerFP.doAnyTrick2(
				() -> ActionResult.SUCCESS
		);
		assertEquals(ActionResult.SUCCESS, result);
	}

	/**
	 * Lambda function implementing ITrainable3 interface -
	 * with multiple arguments
	 */
	@Test
	public void testDoAnyTrick3(){
		ActionResult result = AnimalManagerFP.doManyTricks(
				(trick1, trick2) -> ActionResult.SUCCESS
		);
		assertEquals(ActionResult.SUCCESS, result);
	}

	/**
	 * Named Lambda function implementing ITrainable3 interface
	 */
	@Test
	public void testDoAnyTrick3_namedLambda(){
		ITrainable3 animalToTrainAsNamedLambda =
				(trick1, trick2) -> ActionResult.SUCCESS;

		ActionResult result = AnimalManagerFP.doManyTricks(animalToTrainAsNamedLambda);
		assertEquals(ActionResult.SUCCESS, result);
		ActionResult result4 = AnimalManagerFP.doManyTricksWith4(
				(trick1, trick2) -> ActionResult.SUCCESS
		);

	}

	/**
	 * Lambda function implementing ITrainable1 interface - with no arguments and no return value;
	 * some action in the body - could be stateful == interfering !
	 */
	@Test
	public void testDoAnyTrick1_doSomethingBad(){
		ActionResult result = AnimalManagerFP.doAnyTrick1(
				() -> {
					System.out.println("I'm going to write something into a DB or file system or S3 ...");
					// do something bad
				}
		);
		assertEquals(ActionResult.SUCCESS, result);
	}

}
