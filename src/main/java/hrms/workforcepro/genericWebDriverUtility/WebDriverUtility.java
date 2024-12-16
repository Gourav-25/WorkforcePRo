package hrms.workforcepro.genericWebDriverUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	public void selectByIndex(WebElement element,int i) {
	Select sel=new Select(element);
	sel.selectByIndex(i);
	}
	public void selectByValue(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void selectByVisibleText(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
	}
}
