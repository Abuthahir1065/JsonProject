package com.atmecs.project.crud;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




public class ReadJsonFile {
	 public  void readFile() throws IOException, ParseException {
		 JSONParser parser=new JSONParser();

		 String file=System.getProperty("user.dir")+"/jsonFileWriter.json";
		 JSONObject object=(JSONObject)parser.parse(new FileReader(file));
		 JSONArray array=(JSONArray) object.get("Employees");
		 System.out.println(array);
		
		 System.out.println("=====================================================");
		 
	 }

	
}

