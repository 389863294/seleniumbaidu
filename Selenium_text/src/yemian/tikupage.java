package yemian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import fixation.loginURL;

public class tikupage extends loginURL {
	
	//��ת����߿��
	public void tzzb() {
		driver.switchTo().frame("menu");
		
	}
	//���������
	public void tkgl() {
		driver.findElement(By.className("tmc_menu_qdb")).click();
	}
	//����������
	public void xztk() {
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
	}
	//����ת����ҳ�棬����ת���ұ߿��
	public void zzzym() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		
	}
	//�����������
	public void srtk(String name) {
		driver.findElement(By.name("d_name")).sendKeys(name);
	}
	//����ύ��ť
	public void djqd() {
		WebElement ok=driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]"));
		ok.click();
		driver.findElement(By.xpath("//*[@id=\"tm_lnk_back\"]")).click();
	}

}
