

import ins.framework.cache.CacheManager;
import ins.framework.cache.CacheService;
import ins.framework.common.ServiceFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class RedisUtil {
//	private static Log redisLog = LogFactory.getLog(RedisUtil.class);
	private static Logger redisLog = LoggerFactory.getLogger(RedisUtil.class);
	
	public static final String SYS_CODE = "0101";
	public static final String REDIS_CONFIG_LOCATION = "redis.properties";//分布式缓存改造后，redis.properties的问题移动到resources
	public static final int REDIS_CONFIG_DEFAULT_MAX_ACTIVE = 60;
	public static final int REDIS_CONFIG_DEFAULT_MAX_WAIT = 100;
	public static final int REDIS_CONFIG_DEFAULT_MAX_IDLE = 30;
	public static final boolean REDIS_CONFIG_DEFAULT_TEST_ON_BORROW = true;
	public static final String IMS_USERCODE = "ims_USERCODE";
		
	/**
	 * 获取hostIp.properties中配置的ip
	 * @return
	 */
	public static String getHostIps(){
		StringBuilder builder = new StringBuilder();
		Properties properties = new Properties();
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("hostIp.properties");
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(Iterator it = properties.entrySet().iterator();it.hasNext();){
			Entry e = (Entry) it.next();
			builder.append(e.getValue().toString()).append(",");
		}
		return builder.toString();
	}
	/**
	 * 加载redis的properties文件
	 * @return
	 */
	public static Properties loadRedisProperties(){
		Properties properties = new Properties();
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(RedisUtil.REDIS_CONFIG_LOCATION);
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
	
	/**
	 * 修改redis配置文件redis.properties中的属性
	 * @param key
	 * @param value
	 */
	public static void changeRedisConfigFilePropertiy(String key, String value) {
		Map<String, String> map = new HashMap<String, String>();
		map.put(key, value);
		changeRedisConfigFilePropertiy(map);
	}
	
	/**
	 * 修改redis配置文件redis.properties中的属性
	 * @param key
	 * @param value
	 */
	public static void changeRedisConfigFilePropertiy(Map<String, String> map) {
		if(map!=null && map.size()>0){
			Properties properties = new Properties();
			String path = Thread.currentThread().getContextClassLoader().getResource(RedisUtil.REDIS_CONFIG_LOCATION).toString();
			//System.out.println(path);
			path = path.replace("file:", "");
			File file = new File(path);
			try {
				InputStream inputStream = new FileInputStream(file);
				properties.load(inputStream);
				//OutputStream outputStream = new FileOutputStream(filePath); 
				OutputStream outputStream = new FileOutputStream(file);
				
				for(Iterator it = map.entrySet().iterator();it.hasNext();){
					Entry entry = (Entry)it.next();
					properties.setProperty(entry.getKey().toString(), entry.getValue().toString()); 
					redisLog.info("修改redis的配置文件redis.properties中的属性。将" + entry.getKey().toString() + "的值修改为" + entry.getValue().toString());
				}
				 
	            
				// 以适合使用 load 方法加载到 Properties 表中的格式，  
	            // 将此 Properties 表中的属性列表（键和元素对）写入输出流  
				properties.store(outputStream, "redis propertiy changed"); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 根据接口编码得到接口的方法名
	 * @param intfCode
	 * @return
	 */
	public static String getFunctionNameByIntfCode(String intfCode) {
		String result = "";
		if (intfCode != null && !"".equals(intfCode.trim())) {
			if ("D147".equals(intfCode.trim())) {
				result = "getRiskEngageByCBC";
			} else if ("D82".equals(intfCode.trim())) {
				result = "getRiskEngage";
			} else if ("D128".equals(intfCode.trim())) {
				result = "getProjects";
			} else if ("D131".equals(intfCode.trim())) {
				result = "getResource";
			} else if ("D95".equals(intfCode.trim())) {
				result = "getAgent,getAgentAll";
			} else if ("D150".equals(intfCode.trim())) {
				result = "getCertificateNo";
			} else if ("D153".equals(intfCode.trim())) {
				result = "getContractext";
			} else if ("D125".equals(intfCode.trim())) {
				result = "getContractManage";
			} else if ("D151".equals(intfCode.trim())) {
				result = "getAgentPerson";
			} else if ("D152".equals(intfCode.trim())) {
				result = "getAccountInfo";
			} else if ("D93".equals(intfCode.trim())) {
				result = "getServiceInfoByCode";
			} else if ("D94".equals(intfCode.trim())) {
				result = "getUrlByCode";
			} else if ("D126".equals(intfCode.trim())) {
				result = "getPlan";
			} else if ("D117".equals(intfCode.trim())) {
				result = "getPlanInfo";
			} else if ("D96".equals(intfCode.trim())) {
				result = "getRiskClause";
			} else if ("D97".equals(intfCode.trim())) {
				result = "getRiskClauseKind,getRiskClauseKindForall";
			} else if ("D157".equals(intfCode.trim())) {
				result = "getPrpDbankNew";
			} else if ("D158".equals(intfCode.trim())) {
				result = "getPrpDbankArea";
			} else if ("D159".equals(intfCode.trim())) {
				result = "getPrpDbankAccount";
			} else if ("D99".equals(intfCode.trim())) {
				result = "getReinsurer";
			} else if ("D104".equals(intfCode.trim())) {
				result = "getPrpDsettlementByr";
			} else if ("D103".equals(intfCode.trim())) {
				result = "getPrpDsettlementLkr";
			} else if ("D80".equals(intfCode.trim())) {
				result = "getCodeWithRisk,getCodeWithCom";
			} else if ("D107".equals(intfCode.trim())) {
				result = "codeTransform";
			} else if ("D21".equals(intfCode.trim())) {
				result = "translateCode";
			} else if ("D142".equals(intfCode.trim())) {
				result = "countWorkDay";
			} else if ("D110".equals(intfCode.trim())) {
				result = "getPrpDcurrency";
			} else if ("D86".equals(intfCode.trim())) {
				result = "getPrpDtreatyReten";
			} else if ("D100".equals(intfCode.trim())) {
				result = "getCoins";
			} else if ("D123".equals(intfCode.trim())) {
				result = "getCompanys";
			} else if ("D83".equals(intfCode.trim())) {
				result = "getTaxAuthorities";
			} else if ("D113".equals(intfCode.trim())) {
				result = "getclass";
			} else if ("D84".equals(intfCode.trim())) {
				result = "getrisk,getRisk";
			} else if ("D35".equals(intfCode.trim())) {
				result = "getPrpDagent";
			} else if ("D187".equals(intfCode.trim())) {
				result = "getNewCodeCom";
			} else if ("MD5".equals(intfCode.trim())){
				result = "getMD5Key";
			}
			
			else if ("7050001".equals(intfCode.trim())) {
				result = "getUserMsg";
			} else if ("7050015".equals(intfCode.trim())) {
				result = "getAllUserMsg";
			} else if ("S13".equals(intfCode.trim())) {
				result = "getSalesMsg";
			} else if ("7050024".equals(intfCode.trim())) {
				result = "getOldUserCodeByNewUserCode";
			} else if ("7050007".equals(intfCode.trim())) {
				result = "checkPower";
			} else if ("7050008".equals(intfCode.trim())) {
				result = "getPowerInfo";
			} else if ("7050002".equals(intfCode.trim())) {
				result = "getAccMsg";
			} else if ("7050020".equals(intfCode.trim())) {
				result = "getAccountInfo";
			} else if ("7050021".equals(intfCode.trim())) {
				result = "getContractext";
			} else if ("7050022".equals(intfCode.trim())) {
				result = "GetSaCredential";
			} else if ("7050036".equals(intfCode.trim())) {
				result = "getPrpDSellerNoByRequestVo";
			} else if ("S22".equals(intfCode.trim())) {
				result = "GetSabaseInfo";
			} else if ("7050033".equals(intfCode.trim())) {
				result = "getRuralWorkers";
			}

		}
		return result;
	}
	
	public static String getComCodePre4FromPrpCmain(){
		CacheService cacheManager = CacheManager.getInstance("code");
		String comCode = "";
		comCode = (String) cacheManager.getCache("redisComCode");
		if(comCode != null && !"".equals(comCode.trim())){
			return comCode;
		}
		comCode = "3200";
		if(comCode != null && !"".equals(comCode.trim())){
			cacheManager.putCache("redisComCode", comCode);
		}
		return comCode;
	}
	
}
