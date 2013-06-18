import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;


public class rerer extends TestCase {

	@Test
	public void test() throws Exception {
//		fail("Not yet implemented");
		AutoWebDriver autoWebDriver=new AutoWebDriver();
		autoWebDriver.init();
		autoWebDriver.webDriver.get("http://www.google.co.il");
		autoWebDriver.close();
		
		
	}

}
