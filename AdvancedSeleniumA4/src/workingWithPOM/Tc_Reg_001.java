package workingWithPOM;

import org.testng.annotations.Test;

public class Tc_Reg_001 extends BaseClass {
	
	@Test
	public void register()
	{
		RegisterPage rp = new RegisterPage(driver);
		
		rp.getRegisterLink().click();
		rp.getMaleRadioButton().click();
		rp.getFirstNameTextBox().sendKeys("Rocky");
		rp.getLastNameTextBox().sendKeys("Jack");
		rp.getEmailTextBox().sendKeys("rockyJack001@gmail.com");
		
		rp.getPasswordTextBox().sendKeys("RockyJack001!");
		rp.getConfirmPasswordTextBox().sendKeys("RockyJack001!");
		
		rp.getRegisterButton().click();
		
	}

}
