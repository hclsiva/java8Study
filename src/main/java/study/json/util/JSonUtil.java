package study.json.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;

import study.logger.util.LOG;

public class JSonUtil {

	public static void toJson(Object o, String fileName) throws JsonIOException, IOException {
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()
				.create();
		try(FileWriter writer = new FileWriter("output/"+fileName)){
			gson.toJson(o, writer);
		}catch(Exception e) {
			LOG.log(e);
		}
	}
	
	public static <T> T fromJson(String fileName, Class<T> t) {
		Gson gson = new Gson();
		try(FileReader reader = new FileReader("output/"+fileName)){
			T s =  gson.fromJson(reader, t);
			return s;
		}catch(Exception e) {
			LOG.log(e);
		}
		return null;
	}

}
