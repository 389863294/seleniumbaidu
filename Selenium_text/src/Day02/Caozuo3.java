package Day02;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Caozuo3 {
	@Test
	public void open() {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95%E6%89%80%E6%9C%89%E8%AF%BE%E7%A8%8B/selenium/index.html";
		driver.get(url);
		/*
		 * �л���Сҳ������ַ�ʽ��
		 * 1.���Եķ�ʽ
		 * driver.switchTo().frame("id����name����");
		 * driver.findElement(By.id("id"));
		 * 2.�����ķ�ʽ
		 * driver.switchTo().frame(0);
		 * driver.findElement(By.id("user")).sendKeys("��Ϣ");
		 * 
		 * 
		 * 
		 * 
		 */
		//driver.switchTo().frame("aa");
		driver.switchTo().frame(0);
		driver.findElement(By.id("user")).sendKeys("��Ϣ");
		/*���ص���ҳ��
		 * ���ַ���:
		 * ���ص�����ҳ��
		 * ��ҳ��--iframe--iframe
		 * 1.driver.switchTo().parentFrame();������
		 * 2.driver.switchTo().defaultContent();ֱ�����ص�����ҳ��
		 * */
		driver.switchTo().parentFrame();
		driver.findElement(By.id("user")).sendKeys("��Ϣ");
		
		
		
	}

}
