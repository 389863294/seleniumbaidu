package yemian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import fixation.loginURL;

public class loginpage extends loginURL{
	/*public WebElement findelement(By by) {
		return driver.findElement(by);
	}*/
	//�����˺�
	
	
	public void setusername() {
		driver.findElement(By.name("username")).sendKeys("hujianming");	
	}
	//��������
	public void setpassword() {
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
	}
	//ѡ������
	public void setlx() {
		
		WebElement x=driver.findElement(By.name("usertype"));
		Select y=new Select(x);
		y.selectByIndex(2);
	}
	//�����¼
	public void clickloin() {
		WebElement k=driver.findElement(By.className("tm_btn"));
		k.click();
	}
	
	//�ȴ�ʱ��
	public void tiao() throws InterruptedException {
		Thread.sleep(6000);
	}

}
