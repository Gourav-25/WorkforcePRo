package hrms.workforcePro.empprojectTest;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import hrms.wokforcepro.genericfileUtility.ExcelUtility;
import hrms.workforcepro.genericWebDriverUtility.JavaUtility;
import hrms.workforcepro.genericWebDriverUtility.WebDriverUtility;

public class ProjectTest {
	@Test
	public void createProject() throws Throwable {
		ExcelUtility elib = new ExcelUtility();
		// WebDriverUtility wlib=new WebDriverUtility();
		JavaUtility jlib = new JavaUtility();
		String projName = elib.readDataFromExcel("Sheet1", 1, 0);
		String projManager = elib.readDataFromExcel("Sheet1", 1, 1);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://49.249.28.218:8091");
		WebElement ele = driver.findElement(By.id("username"));
		ele.sendKeys("rmgyantra");
		WebElement ele1 = driver.findElement(By.id("inputPassword"));
		ele1.sendKeys("rmgy@9999");
		WebElement ele2 = driver.findElement(By.xpath("//button[text()='Sign in']"));
		ele2.submit();
		driver.findElement(By.xpath("//ul[@class='list-unstyled components']/descendant::a[text()='Projects']"))
				.click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		driver.findElement(By.name("projectName")).sendKeys(projName);
		driver.findElement(By.name("createdBy")).sendKeys(projManager, Keys.TAB, Keys.ENTER);
		jlib.robot();
		// WebElement ddele=driver.findElement(By.name("status"));

		/*
		 * Select sel=new Select(ddele); sel.selectByValue("Created");
		 */

		// wlib.selectByValue(ddele,"Created");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
