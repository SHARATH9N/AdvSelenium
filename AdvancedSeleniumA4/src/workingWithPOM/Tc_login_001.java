package workingWithPOM;

import org.testng.annotations.Test;

public class Tc_login_001 extends BaseClass {
	@Test
	public void login() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.getLoginLink().click();
		lp.getEmailTextBox().sendKeys("goku007@gmail.com");
		lp.getPasswordTextBox().sendKeys("Goku007!");
		lp.getLoginButton().click();
		
		Thread.sleep(3000);
	}
}
