package net.java.scrapy;

import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


public class ButtonScrapy {
	public static String proxyHost = "127.0.0.1";
	public static int proxyPort = 1080;
	
	public WebClient webClient;  
	
	public void proxy () throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		webClient = new WebClient(BrowserVersion.FIREFOX_45, proxyHost, proxyPort);
		
		// 启用JS解释器，默认为true
		webClient.getOptions().setJavaScriptEnabled(true); 
		 // 禁用css支持
        webClient.getOptions().setCssEnabled(false);
        // 设置Ajax异步处理控制器即启用Ajax支持
        webClient.setAjaxController(new NicelyResynchronizingAjaxController());
        // 当出现Http error时，程序不抛异常继续执行
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        // 防止js语法错误抛出异常
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        
        webClient.getOptions().setAppletEnabled(true);    
        webClient.getOptions().setGeolocationEnabled(true);    
        webClient.getOptions().setRedirectEnabled(true); 
        
        HtmlPage htmlPage = webClient.getPage("https://www.gia.edu/CN/report-check?reportno=6272432656"); 
	}
}
