package Day02;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caozuo5 {
	@Test
	public void openkkk() {
		
			System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String url="F:/�������/����������пγ�/selenium/frame.html";
			driver.get(url);
			//selenlum��ͼ
			File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(jietu, new File("D:/test.png"));
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
			driver.switchTo().frame("frame");
			driver.findElement(By.id("input1")).sendKeys("1234");
			driver.switchTo().defaultContent();
			String wen=driver.findElement(By.id("id1")).getText();
			//getText��ȡid�����е�����
			System.out.println(wen);
			
			
			
			
			
		
	}

}
