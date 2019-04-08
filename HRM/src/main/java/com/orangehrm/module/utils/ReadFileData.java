package com.orangehrm.module.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class ReadFileData {

	Properties prop;

	public Properties getDataFromPropertiesFile(String filePath) {
		inIt(filePath);

		return prop;
	}

	public HashMap<String, String> getAllKeysDataFromFile(String filePath) {
		inIt(filePath);
		HashMap<String, String> data = null;
		if (prop != null) {
			Enumeration KeyValues = prop.keys();
			data = new HashMap<String, String>();
			while (KeyValues.hasMoreElements()) {
				String key = (String) KeyValues.nextElement();
				data.put(key, prop.getProperty(key));

			}
		}
		return data;
	}

	public void inIt(String filePath) {
		File file = new File(filePath);
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
