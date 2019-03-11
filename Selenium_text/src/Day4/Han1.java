package Day4;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Han1 {
	WebDriver driver;
	String url;
	@BeforeClass
	public void caozuo5() {
		/*�������*/
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
		url="http://flight.qunar.com";
	}
	@AfterClass
	public void caozuo6() {
		//driver.close();
		
	}
	
	@Test
	public void caozuo1(){
		
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"searchTypeSng\"]")).click();
		//driver.findElement(By.name("fromCity")).sendKeys("����");
		//WebElement k=driver.findElement(By.name("toCity"));
		//k.sendKeys("�Ϻ�");
		
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd"); 
		//Calendar getInstance() ʹ��Ĭ��ʱ�������Ի������ַ������һ��������
		Calendar calendar = Calendar.getInstance();
		//�ڵ�ǰ������+7��
		calendar.add(calendar.DATE, 7);
		//��ʱ������ȡ��
		String date=df.format(calendar.getTime());
		System.out.println(date);
		WebElement x=driver.findElement(By.name("fromDate"));
		x.sendKeys(Keys.chord(Keys.CONTROL, "a"),date);
		WebElement y=driver.findElement(By.className("btn_search"));
		y.click();
		driver.findElement(By.className("btn_book js-wrlist-btn")).click();
		driver.switchTo().frame("Left");
		

        
	}
	
	

}
