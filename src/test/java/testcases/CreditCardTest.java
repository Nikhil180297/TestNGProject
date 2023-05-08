package testcases;

import org.testng.annotations.Test;

public class CreditCardTest extends BaseClass {
	
	@Test(groups= {"regression"})   //by default 0 priority
	public void test4() {
		
		System.out.println("Inside Credit card test 4");
	}

}
