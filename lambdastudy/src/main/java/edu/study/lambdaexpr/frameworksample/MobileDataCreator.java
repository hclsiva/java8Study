package edu.study.lambdaexpr.frameworksample;

import java.util.ArrayList;
import java.util.List;

import study.schema.beans.Mobile;
import study.schema.beans.MobileList;

public class MobileDataCreator {

	public MobileDataCreator() {		
	}
	
	public static List<Mobile> getMobileList() {
		List<Mobile> mobileList= new ArrayList<Mobile>();
		
		Mobile mobile = new Mobile();
		mobile.setMobileId(10001);
		mobile.setMobileCompanyName("Samsung");
		mobile.setOsName("Android");
		mobile.setPrice(12000);
		mobile.setColor("Black");
		mobileList.add(mobile);
		
		mobile = new Mobile();
		mobile.setMobileId(10002);
		mobile.setMobileCompanyName("Samsung");
		mobile.setOsName("Android");
		mobile.setPrice(14000);
		mobile.setColor("White");
		mobileList.add(mobile);

		mobile = new Mobile();
		mobile.setMobileId(10003);
		mobile.setMobileCompanyName("Samsung");
		mobile.setOsName("Android");
		mobile.setPrice(16000);
		mobile.setColor("Gold");
		mobileList.add(mobile);
		
		mobile = new Mobile();
		mobile.setMobileId(10004);
		mobile.setMobileCompanyName("Sony Ericsson");
		mobile.setOsName("Android");
		mobile.setPrice(12000);
		mobile.setColor("Black");
		mobileList.add(mobile);
		
		mobile = new Mobile();
		mobile.setMobileId(10005);
		mobile.setMobileCompanyName("Oppo");
		mobile.setOsName("Android");
		mobile.setPrice(12000);
		mobile.setColor("White");
		mobileList.add(mobile);

		mobile = new Mobile();
		mobile.setMobileId(10006);
		mobile.setMobileCompanyName("Oppo");
		mobile.setOsName("Android");
		mobile.setPrice(13500);
		mobile.setColor("Black");
		mobileList.add(mobile);
		
		mobile = new Mobile();
		mobile.setMobileId(10007);
		mobile.setMobileCompanyName("Nokia");
		mobile.setOsName("Windows");
		mobile.setPrice(13500);
		mobile.setColor("Black");
		mobileList.add(mobile);
		
		mobile = new Mobile();
		mobile.setMobileId(10008);
		mobile.setMobileCompanyName("Nokia");
		mobile.setOsName("Windows");
		mobile.setPrice(15500);
		mobile.setColor("Red");
		mobileList.add(mobile);

		mobile = new Mobile();
		mobile.setMobileId(10009);
		mobile.setMobileCompanyName("MI");
		mobile.setOsName("Android");
		mobile.setPrice(16500);
		mobile.setColor("Red");
		mobileList.add(mobile);
		
		mobile = new Mobile();
		mobile.setMobileId(10010);
		mobile.setMobileCompanyName("MI Note");
		mobile.setOsName("Android");
		mobile.setPrice(13500);
		mobile.setColor("Gold");
		mobileList.add(mobile);
		
		return mobileList;
	}
	

}
