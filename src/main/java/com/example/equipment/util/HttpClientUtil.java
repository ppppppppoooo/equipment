package com.example.equipment.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.cyberneko.html.parsers.DOMParser;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.DOMReader;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class HttpClientUtil {
	public static String httpGetOperation(String url) throws ClientProtocolException, IOException{
		HttpClientBuilder builder=HttpClientBuilder.create();
		CloseableHttpClient client=builder.build();
		HttpGet get=new HttpGet(url);
		get.addHeader(
				"User-Agent",
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; QQDownload 1.7; .NET CLR 1.1.4322; CIBA; .NET CLR 2.0.50727)");
		CloseableHttpResponse response= client.execute(get);
		
		String str=EntityUtils.toString(response.getEntity());
		return str;
	}
	
	public static void httpGetByMovie() throws ClientProtocolException, IOException, SAXException{
		//neko
		DOMParser parse=new DOMParser();
		for (int i = 1; i <=1 ; i++) {
			String url="http://www.ygdy8.net/html/gndy/dyzz/list_23_"+i+".html" ;
			parse.parse(url);
			//返回w3c的document
			Document doc=parse.getDocument();
			//将w3c的docment转换成dom4j
			org.dom4j.Document dom4jDoc=
					new DOMReader().read(doc);
//			System.out.println(dom4jDoc.asXML());
			//存储命名空间
			Map map=new HashMap();
			map.put("myName", "http://www.w3.org/1999/xhtml");
			//    /	根路径  	//任意路径   [@属性=值]
			XPath xpath=dom4jDoc.createXPath("//myName:TABLE[@class=\"tbspan\"]//myName:A[@class=\"ulink\"]");
			xpath.setNamespaceURIs(map);
			List<Element> list=xpath.selectNodes(dom4jDoc);
			for (Element element : list) {
				System.out.println(element.asXML());
			}
			
		}
		
		
	}
	
	
	public static String httpPostOperation(String url) throws ClientProtocolException, IOException{
		//创建工厂
		HttpClientBuilder builder=HttpClientBuilder.create();
		//创建客户端
		CloseableHttpClient client=builder.build();
//		https://www.baidu.com/s?wd=笔记本
		HttpPost post=new HttpPost(url);
		post.addHeader(
				"User-Agent",
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; QQDownload 1.7; .NET CLR 1.1.4322; CIBA; .NET CLR 2.0.50727)");
		
		List<NameValuePair> list=new ArrayList<NameValuePair>();
		/*list.add(new BasicNameValuePair("username", "中文"));
		list.add(new BasicNameValuePair("password", "123"));*/
		
		UrlEncodedFormEntity entity=
				new UrlEncodedFormEntity(list,"UTF-8");
		post.setEntity(entity);
		CloseableHttpResponse response= client.execute(post);
		String str=EntityUtils.toString(response.getEntity());
		return str;
	}
	
	
	public static void main(String[] args) throws ClientProtocolException, IOException, SAXException {
//		HttpClientUtil.httpGetOperation();
		//httpGetOperation();
//		httpPostOperation();
	}
	
}
