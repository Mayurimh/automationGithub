package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsPracticeTest {
	@Test
	public void jenkinsPracticeTest() {
		Reporter.log("Hi jenkins!",true);
		Reporter.log("Hi mayuri!",true);
	}
}
