
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
public class Test {

	private String checkResponseResult(String responseXML, String proposalNo) throws Exception
	  {
	    String returnStr = null;
	    Document document = null;
	    try {
	      document = DocumentHelper.parseText(responseXML);
	    } catch (DocumentException e) {
	      e.printStackTrace();
	    }
	    Element root = document.getRootElement();
	    Node head = null;
	    String responseCode = null;
	    if (root.selectSingleNode("responsehead") != null) {
	      head = root.selectSingleNode("responsehead");
	      responseCode = head.selectSingleNode("response_code").getText();
	    } else {
	      head = root.selectSingleNode("Head");
	      responseCode = head.selectSingleNode("RESPONSECODE").getText();
	    }
	    if ("1".equals(responseCode)) {
	      Node body = root.selectSingleNode("Body");
	      String returnNo = body.selectSingleNode("PROPOSALNO").getText();
	      if (proposalNo.equals(returnNo))
	        returnStr = "1";
	    }
	    else
	    {
	      returnStr = "" + head.selectSingleNode("error_message").getText();
	    }

	    return returnStr;
	  }
	
	/*public static void main(String[] args){
		Test t = new Test();
		File file = new File("E:/2.xml");
		Long filelength = file.length();  
		String s = "";
        byte[] filecontent = new byte[filelength.intValue()];
	    try {
	    	FileInputStream in = new FileInputStream(file);  
            in.read(filecontent);  
            in.close();  
	    }
	    catch (Exception e) {
	    }
	    
		try {
		 s = new String(filecontent,"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
		try {
			t.checkResponseResult(s, "1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Test t = new Test();
		t.test1(null);
	}*/
	
	private String test1(String a){
		try{
		}catch(Exception e){
			System.out.println("aaaaaaaa");
			e.printStackTrace();
		}
		System.out.println("bbbbb");
		return "";
	}
	
	public static void main(String[] args){
		try {
			/*System.out.println(3/0);
			System.out.println(Test.encrypt("15578982026", "diaoyudaoshizhongguode"));
			String a = Test.encrypt("15578982026", "diaoyudaoshizhongguode");
			System.out.println("加密前------"+"15578982026");
			System.out.println("加密后------"+a);
			String b = Test.decrypt(a, "diaoyudaoshizhongguode");
			System.out.println("解密后------"+b);
			String mobile_temp = "YG|7ApcaK18WoORpc/qGkScDx5ze2M+QymFhtVdSiCax4M=".substring("YG|7ApcaK18WoORpc/qGkScDx5ze2M+QymFhtVdSiCax4M=".indexOf(\"|\") + 1);
			System.out.println(Test.decrypt(mobile_temp, "diaoyudaoshizhongguode"));
			*/
//			String json1 = *CAM6460B5*
			String json = "{\"query\": {\"bool\": {\"must\": [],\"should\": [{\"wildcard\": {\"vehicleName.raw\": \"**HJ150-10A**\"}},{\"wildcard\": {\"vehicleId.raw\": \"*HJ150-10A*\"}}],\"minimum_should_match\": 1}},\"from\": 0,\"size\": 1}";
			System.out.println(Test.executeQuery("http://10.133.240.105:9200/logstash-car-msg/_search?pretty", json,"GET"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Test t = new Test();
		t.search();
		String s = "http://10.133.212.239:7200/logstash-car-msg/carmsg/2019-03-17 06:15:00";
		Test.delete(s);*/
	}
	private static void delete(String s){
	    long start = System.currentTimeMillis();

	    HttpMethod method = new DeleteMethod(s);
	    try {
	      HttpClient client = new HttpClient();
	      client.executeMethod(method);
	    } catch (HttpException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    finally {
	      method.releaseConnection();
	    }
	}
	//调用搜索引擎
	private static String search(String url,String json){
	        long start = System.currentTimeMillis();
	        String result = null;
	        try {
	            URL u = new URL(url);// 创建连接
	            HttpURLConnection connection = (HttpURLConnection) u.openConnection();
	            connection.setDoOutput(true);
	            connection.setDoInput(true);
	            connection.setUseCaches(false);
	            connection.setInstanceFollowRedirects(true);
	            connection.setRequestMethod("POST"); // 设置请求方式
	            connection.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式
	            connection.setRequestProperty("Content-Type", "application/json"); // 设置发送数据的格式
	            connection.connect();
	            OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8"); // utf-8编码
	            out.append(json);
	            out.flush();
	            out.close();
	            // 读取响应
	            InputStream is = connection.getInputStream();
	            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	            String readLine = null;
	            StringBuffer sbf = new StringBuffer();
	            while ((readLine = reader.readLine()) != null) {
	                sbf.append(readLine);
	            }
	            reader.close();
	            result = sbf.toString();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return result; // 自定义错误信息
	    }
	/*public static void main(String[] args) throws Exception{
		String json = "{\"query\": {\"bool\": {\"must\": [],\"should\": " +
				"[{\"wildcard\": {\"vehicleId.raw\": \"CCAAMD0572\"}}],\"minimum_should_match\":1}},\"from\":0,\"size\":1}}";
		System.out.println(Test.executeQuery("http://10.133.212.241:8200/logstash-car-msg/_search?pretty", json,"GET"));
	}*/
	private static String executeQuery(String urlString, String param, String requestMethod) {
	    long start = System.currentTimeMillis();
	    String result = null;
	    try {
	      URL url = new URL(urlString);
	      HttpClient httpClient = new HttpClient();
	      HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	      connection.setDoOutput(true);
	      connection.setDoInput(true);
	      connection.setUseCaches(false);
	      connection.setInstanceFollowRedirects(true);
	      connection.setRequestMethod(requestMethod);
	      connection.setRequestProperty("Accept", "application/json");
	      connection.setRequestProperty("Content-Type", "application/json");
	      connection.connect();
	      OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
	      out.append(param);
	      out.flush();
	      out.close();
	      InputStream is = connection.getInputStream();
	      BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	      String readLine = null;
	      StringBuffer sbf = new StringBuffer();
	      while ((readLine = reader.readLine()) != null)
	        sbf.append(readLine);
	      reader.close();
	      return result = sbf.toString();
	    } catch (IOException e) {
	      e.printStackTrace();
	      return "";
	    }
	  }
}
