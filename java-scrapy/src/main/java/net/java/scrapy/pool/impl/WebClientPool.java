package net.java.scrapy.pool.impl;

import java.util.concurrent.LinkedBlockingQueue;

import com.gargoylesoftware.htmlunit.WebClient;

import net.java.scrapy.pool.ProxyPool;

public class WebClientPool implements ProxyPool<WebClient> {
	private static final LinkedBlockingQueue<WebClient> POOLS = new LinkedBlockingQueue<WebClient>();
	
	public void init() {
	}
	public WebClient getPool() {
		return null;
	}

	public boolean close(WebClient pool) {
		return false;
	}
	
	public static void main(String[] args) {
	}
}
