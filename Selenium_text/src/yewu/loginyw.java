package yewu;

import org.testng.annotations.Test;

import fixation.loginURL;
import yemian.loginpage;
import yemian.tikupage;

public class loginyw{
	
	public void loginb() throws InterruptedException {
		loginURL kkk=new loginURL();
		loginpage page=new loginpage();
		kkk.caozuo();
		page.setusername();
		page.setpassword();
		page.setlx();
		page.tiao();
		page.clickloin();
		/*
		tikupage tk=new tikupage();
		page.tiao();
		tk.tzzb();
		tk.tkgl();
		tk.xztk();
		tk.zzzym();
		tk.srtk();
		tk.djqd();*/
	}
	

}
