import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ExpiryPolicyBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
//import org.ehcache.expiry.Expirations;

public class PIT {
	//private ArrayList<Cache> caches;
	private Cache<byte[], List> PIT;
	private Cache<byte[], byte[]> CS;
	private String tester;
	
	public PIT() {
		//this.caches = createCaches();
		this.createCaches();
	}
	
	public void createCaches() {
		//ArrayList<Cache> caches = new ArrayList<Cache>();
		CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder()
				.build();
		
		cacheManager.init();
		//Nao consigo usar ArrayList<String> com o metodo .class, daí usar array de Strings
		PIT = cacheManager.createCache("PIT",
				CacheConfigurationBuilder.newCacheConfigurationBuilder(byte[].class, List.class, ResourcePoolsBuilder.heap(100))
				.withExpiry(ExpiryPolicyBuilder.timeToIdleExpiration(Duration.ofMinutes(15))));
		
		CS = cacheManager.createCache("contentStore",
				CacheConfigurationBuilder.newCacheConfigurationBuilder(byte[].class, byte[].class, ResourcePoolsBuilder.heap(100))
				.withExpiry(ExpiryPolicyBuilder.timeToIdleExpiration(Duration.ofMinutes(15))));

		//caches.add(PIT);
		//caches.add(CS);
		//this.PIT = PIT;
		//this.CS = CS;
		
		//return caches;
	}
	
	/*public ArrayList<Cache> getCaches(){
		return this.caches;
	}*/
	
	public void insertPIT(byte[] name, String inf) {
		//ArrayList<String> aux = new ArrayList<String>(((PIT) PIT).checkPIT(name));
		ArrayList<String> aux = new ArrayList<String>(PIT.get(name));
		aux.add(inf);
		PIT.put(name, aux);
	}
	
	public ArrayList<String> checkPIT(byte[] name) {
		ArrayList<String> out = new ArrayList<String>(PIT.get(name));
		return out;
	}
	
	public void insertCS(byte[] name, byte[] data) {
		CS.put(name, data);
	}
	
	public byte[] checkCS(byte[] name) {
		byte[] out = CS.get(name);
		return out;
	}
	
	
}
