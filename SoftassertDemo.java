package practice2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import testng.framework.Assert;

public class SoftassertDemo {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Test
		public void softassert(){
			
			SoftAssert assertion = new SoftAssert();
			System.out.println("Soft assert started");
			assertion.assertEquals(12, 13);	
			System.out.println("Soft assert ended");
			assertion.assertAll();

		}

		
		@Test
		public void hardassert(){
			System.out.println("hard assert started");
			Assert.assertEquals(12, 13);
			System.out.println("hard assert ended");
	}
	//}

}
