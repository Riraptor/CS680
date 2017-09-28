package homework10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;


public class FIFO implements CacheReplacementPolicy {
	static FIFO instance = null;
	private FIFO(){
		
	}
	
	public static FIFO getInstance(){
		if (instance == null){
				instance = new FIFO();
		}
		return instance;
	}
	
	@Override
	public void replace(LinkedHashMap<Path , String> cache, Path targetFile) {
		cache.remove(cache.entrySet().iterator().next().getKey());
		try {
			cache.put(targetFile, new String(Files.readAllBytes(targetFile)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String message() {
		return("FIFO REPLACEMENT FOR ");
	}

	

}
