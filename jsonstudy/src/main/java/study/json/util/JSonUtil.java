package study.json.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;

import study.logger.util.LOG;

public class JSonUtil {

	public static <T> void toJson(T t, String fileName) throws JsonIOException, IOException {
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()
				.create();
		try(FileWriter writer = new FileWriter(fileName)){
			String json = gson.toJson(t);
			LOG.log(json);
			LOG.log("Writing the json to the file "+fileName);
			gson.toJson(t, writer);
		}catch(Exception e) {
			LOG.log(e);
		}
	}
	
	public static <T> T fromJson(String fileName, Class<T> t) {
		Gson gson = new Gson();
		try(FileReader reader = new FileReader(fileName)){
			T s =  gson.fromJson(reader, t);
			LOG.log("Reading json from "+ fileName+ " completed.");			
			return s;
		}catch(Exception e) {
			LOG.log(e);
		}
		return null;
	}

}
