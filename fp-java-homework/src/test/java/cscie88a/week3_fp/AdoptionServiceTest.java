package cscie88a.week3_fp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdoptionServiceTest {

	@Test
	public void testMethodReference_static(){
		AdoptionService service = new AdoptionService();
		IAdoptable lambdaMethodRef = AbstractAnimalFP::checkForAdoptionStatusStatic;
		ActionResult result = service.tryToAdopt( lambdaMethodRef );
		assertEquals(ActionResult.SUCCESS, result);
	}

	@Test
	public void testMethodReference_specific_instance(){
		AdoptionService service = new AdoptionService();
		DogFP lilo = new DogFP("Lilo");
		lilo.setHasCurrentShots(true);
		IAdoptable myLambda = () -> true;
		IAdoptable lambdaMethodRef = lilo::checkForAdoptionStatusInstance;

		ActionResult result = service.tryToAdopt( lambdaMethodRef );
		assertEquals(ActionResult.SUCCESS, result);

		lilo.setHasCurrentShots(false);
		result = service.tryToAdopt( lambdaMethodRef );
		assertEquals(ActionResult.FAILURE, result);
	}

	/******* following unit tests are to be implemented in the HW3 **********/

	@Test
	public void testTryToAdopt1(){
		//TODO implement this
	}

	@Test
	public void testTryToAdopt2(){
		//TODO implement this
	}

	@Test
	public void testTryToAdopt1_namedLambda(){
		//TODO implement this
	}

	@Test
	public void testTryToAdopt2_namedLambda(){
		//TODO implement this
	}

}
