package Day01;



import org.junit.Test;
import org.openqa.selenium.Dimension;//�����������С
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openliu {
	@Test
	public void open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		String url="https://baidu.com";
		String url1="https://taobao.com";
		driver.get(url);//����ַ����1
		driver.navigate().to(url1);//����ַ����2
		Thread.sleep(6000);//��ͣ6��
		driver.navigate().back();//���������һ��
		String a=driver.getTitle();
		System.out.println(a);
		driver.navigate().forward();//�����ǰ��һ��
		String b=driver.getTitle();//��ȡ��ǰҳ��ı���
		System.out.println(b);//��ӡ����
		driver.navigate().refresh();//ˢ�������
		driver.manage().window().maximize();//��������
		Dimension dimension=new Dimension(600,600);//�������������
		driver.manage().window().setSize(dimension);
		String urls=driver.getCurrentUrl();
		System.out.println(urls);
		driver.close();
		
	}
	

}
