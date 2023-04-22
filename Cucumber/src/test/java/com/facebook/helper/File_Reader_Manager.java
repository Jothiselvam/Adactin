package com.facebook.helper;

import java.io.IOException;

import com.adactin.properties.Config_Reader;

public class File_Reader_Manager {
	private File_Reader_Manager() {
		
	}
public static File_Reader_Manager getInstance() {
	File_Reader_Manager helper=new File_Reader_Manager();
	return helper;
	
}
public Config_Reader getInstanceCR() throws IOException {
	Config_Reader reader= new Config_Reader();
	return reader;
	
}
}
