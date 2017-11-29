package net.java.scrapy;

import net.java.scrapy.context.AppContext;

public class ScrapyApp {
	public static void main(String[] args) {
		System.out.println(AppContext.getBean("date"));
	}
}
