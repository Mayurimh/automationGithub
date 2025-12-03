package github;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GithubPracticeTest {
	@Test
	public void githubPractice() {
		Reporter.log("Hii Github!",true);
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}
}
