package JSONFileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFileReaderClass {

	private static FileReader reader;
	private static Object obj;

	public static String getJSONKeyValue(String key,String fileName) {
		JSONParser parser = new JSONParser();
		try {
			reader = new FileReader(".\\TestData\\"+fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			try {
				obj=parser.parse(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JSONObject JSONObj = (JSONObject)obj;
		String value= (String) JSONObj.get(key);
		return value;		
	}
}
