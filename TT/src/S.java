import java.io.File;
import java.io.FileInputStream;
import java.util.Calendar;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.encoding.XMLType;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;



public class S {

	public String sendToMarketPhoneData(String requestXML)
    
  {	
		try{
		File file = new File("1.xml");
		Long filelength = file.length();  
        byte[] filecontent = new byte[filelength.intValue()];
	    try {
	    	FileInputStream in = new FileInputStream(file);  
            in.read(filecontent);  
            in.close();  
	    }
	    catch (Exception e) {
	    }
	  
		String s = new String(filecontent,"utf-8"); 
    System.out.println("报文是：------"+s);
    System.out.println("开始时间是："+new Date());
    String marketURL = "http" + "://" + "10.133.240.76" + ":" + "7007" + "/" + "base" + "/" + "services/receiveProposalInfo";

    String namespace = "http://proposalinforeceive.webserviceserver.piccapp.com/";
    String responseXML = null;
    Service service = new Service();
    System.out.println("开始生成时间是："+new Date());
    Call call = (Call)service.createCall();
    String result = "";
    call.setTargetEndpointAddress(marketURL);
    call.setOperationName(new QName(namespace, "receiveProposalInfo"));
    call.addParameter("xml", XMLType.XSD_STRING, ParameterMode.IN);
    System.out.println("开始调用时间是："+new Date());
    result = (String)call.invoke(new Object[] { s });
    System.out.println("调用完成时间是："+new Date());
    if ((result != null) && (!("".equals(result))))
      responseXML = result;
    else {
      responseXML = "<Packet type=\"RESPONSE\" version=\"1.0\"><Head><RESPONSECODE>0</RESPONSECODE><ERRORMESSAGE>营销手机未返回信息</ERRORMESSAGE></Head></Packet>";
    }
    System.out.println("结束时间是："+new Date());
    return responseXML;
		}catch(Exception e){
			e.printStackTrace();
			return "";
		}
  }
	
	public static void main(String[] args){
		S s = new S();
		try {
			String b = s.sendToMarketPhoneData("1");
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*String endorTypes="72,50,63,76";
		System.out.println(endorTypes.indexOf("42,05,15"));
		
		Calendar c = Calendar.getInstance();

	    Date currentTime = c.getTime();

	    c.set(11, 0);
	    c.set(12, 0);
	    c.set(13, 0);
	    c.add(5, -2);

	    Date twoDayAge = c.getTime();
	    System.out.println(twoDayAge);
	    System.out.println(currentTime);*/
	}
}
