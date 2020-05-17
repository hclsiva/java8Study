package study.json;

import java.io.IOException;

import study.json.bean.MobileList;
import study.json.util.JSonUtil;
import study.logger.util.LOG;

import com.google.gson.JsonIOException;

public class Main {

	public Main() {		
	}

	public static void main(String[] args) {
		LOG.log("Mobile data creation");
		MobileList mobiles = MobileDataCreator.getMobileList();
		LOG.log(mobiles);
		
		try {
			LOG.log("Coverting mobiles to JSON");
			JSonUtil.toJson(mobiles, "mobiles.json");
			
			mobiles = JSonUtil.fromJson("mobiles.json", MobileList.class);
			LOG.log("Content of mobiles = " + mobiles);
			
		} catch (JsonIOException | IOException e) {
			LOG.log(e);
		}
		
	}
}
