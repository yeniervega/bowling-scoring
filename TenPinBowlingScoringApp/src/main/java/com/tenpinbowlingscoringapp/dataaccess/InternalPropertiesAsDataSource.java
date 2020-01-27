package com.tenpinbowlingscoringapp.dataaccess;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class InternalPropertiesAsDataSource implements DataSource<String> {

	private String path;
	private String key;	

	public InternalPropertiesAsDataSource(String path, String key) {
		super();
		this.path = path;
		this.key = key;
	}

	@Override
	public String getData() {
		Properties p = new Properties();
		String propertyValue = "";
		try (InputStream ins = getClass().getResourceAsStream(this.path)) {
			p.load(ins);
			propertyValue = (String) p.get(this.key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propertyValue;
	}
}
