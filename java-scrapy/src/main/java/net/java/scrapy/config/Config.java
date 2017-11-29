package net.java.scrapy.config;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	private static Properties properties = new Properties();

	private Config() {
		super();
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
	
	public static void main(String[] args) {
		try {
			properties.load(new FileInputStream(System.getProperty("java.class.path") + "/config/config.property"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(properties.getProperty("pid"));
		
		System.out.println(System.getProperty("java.class.path").split(";")[0]);
		System.out.println(System.getProperty("user.dir"));
	}
}
