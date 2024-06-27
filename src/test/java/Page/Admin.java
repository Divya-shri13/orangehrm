package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin {
/*@FindBy(xpath="//button[@type='submit']")
private WebElement btnclick;*/
	
	@FindBy(xpath="//span[text()='Admin']")
	 private WebElement AdminClick;
	
	@FindBy(xpath="//button[@type='button'])[4]")
	private WebElement AddClick;
	
	@FindBy(xpath="//div[text()='Admin']")
	private WebElement AdminSelect;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement textTypeforhints;
	
	@FindBy(xpath="//div[text()='Enable']")
	private WebElement statusSelect;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	private WebElement textUsername;

	@FindBy(xpath="//input[@class='password']")
	private WebElement textpassword;
	
	
	
	
	
	
}
