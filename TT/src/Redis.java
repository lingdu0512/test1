import ins.framework.common.ServiceFactory;
import net.sf.ehcache.Element;
import com.sinosoft.redis.client.main.CacheManager;



public class Redis {

	public void redisTest(){
		CacheManager redisCacheService = new CacheManager(RedisUtil.SYS_CODE);
		String cacheKey = redisCacheService.generateCacheKey("getUserMsg","13166472");
		  UserMsgResInfo element = getCacheData(cacheKey,redisCacheService);
		  System.out.println("用户信息是："+element);
	}
	
	public  <T> T getCacheData(String key,CacheManager redisCacheService) {
		T cache_1 = null;
//		String sysCode = "0101";//系统代码，用来生成redis的key
		
		String comCodeTmp = "32000000";
		String redisComCode = "3200";
		String newKey  = redisCacheService.generateCacheKey(redisComCode , RedisUtil.SYS_CODE , key);
		
		String readConfig = "1";
		
		if("1".equals(readConfig.trim())){
			//1-读远程缓存
			try {
				cache_1 = (T) redisCacheService.getCache(newKey);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return cache_1;
	}
	
	public static void main(String[] args){
		Redis r = new Redis();
		r.redisTest();
	}
}
