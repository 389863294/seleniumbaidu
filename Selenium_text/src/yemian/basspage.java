package yemian;

import fixation.loginURL;

public class basspage extends loginURL{
	//��ת����߿��
		public void tzzb() {
			driver.switchTo().frame("menu");
		}
		//����ת����ҳ�棬����ת���ұ߿��
		public void zzzym() {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
		}
		

}
