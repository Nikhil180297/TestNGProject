package testcases;

import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass {
	
	@Test(dependsOnMethods="test2")  //by default 0 priority
	public void test1() {
		
		System.out.println("Inside home loan test 1");
	}

    @Test(groups= {"sanity","regression"})   //by default 0 priority  and //Sanity test cases will be run daily bases 
    public void test2() {
	
	System.out.println("Inside home loan test 2");
   }
    
   
}
  