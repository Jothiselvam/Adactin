package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {
	public static Properties p;
	public Config_Reader() throws IOException {
		File f= new File
				("C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\adactin\\properties\\Config.properties");

	FileInputStream fis = new FileInputStream(f);
	p=new Properties();
	p.load(fis);
	}
	public String getBrowser() {
		String browser=p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url=p.getProperty("url");
		return url;
	}

}
