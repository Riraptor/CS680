package homework11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileCache {
	
	CacheReplacementPolicy replacementPolicy = new NullReplacement();
	public int max_cache_size = 3;
	public String targetFile;
	private LinkedHashMap<Path, String> cache = new LinkedHashMap<Path, String>();
	public String CachePath = "src/homework11/CacheFolder/";
	public String DiskPath = "src/homework11/DiskFiles/";
	static FileCache instance = null;

	private FileCache() throws IOException {	

	}

	public static FileCache getInstance() { 		
		//method used by other classes to get instance of FileCache
		if (instance == null){
			try {
				instance = new FileCache();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		return instance;
	}
	
	

	public String fetch(Path targetFile) {
		File CacheFile = new File(CachePath + targetFile);
		try{
			// If the file is already Cashed : 
			if (cache.get(CacheFile) != null) {
						
						return "ALREADY IN CACHE " + targetFile;
			}
			// If the file is not cashed yet:
			else {			
						//File FileFromDisk = new File(DiskPath + targetFile);
						// If cache size is not full
				if(cache.size() < max_cache_size) {		
					cacheFile(targetFile);
					return "STORED " + targetFile.getFileName();
				}
						// If cache size is full
						else{	
			// Passing File instead of String with replace(...) because thats how it is defined in UML.
							replace(targetFile); 
							 return replacementPolicy.message() + targetFile.getFileName();
							
						}
			}
		} catch (Exception e) {
			throw new FetchNotFoundException();
		  } finally {
				 for (Map.Entry<Path, String> entry : cache.entrySet()){
				  		System.out.println(" Hash Values------ "+entry.getValue());
				 }
		
			 /* 		
			 FileOutputStream fileOutputStream = new FileOutputStream(CachePath + "HashStore.ser");
			  		ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);

			  		objectOutputStream.writeObject(cache);
			  		objectOutputStream.close();
			  		System.out.println("Map Stored on file");*/
		  }
	}
	
	
	void setCacheReplacementPolicy() {
		 replacementPolicy = FIFO.getInstance();
		 System.out.println("POLCY CHANGED TO FIFO");
	}

	private void replace(Path targetfile) {
		if (replacementPolicy != null){
			replacementPolicy.replace(cache, targetfile); 
		} else {
			System.out.println("NULL REPLACEMENT, NO CHANG!E");
		}
	}
	

	private void cacheFile(Path targetFile) throws IOException {
		
		cache.put(targetFile, new String(Files.readAllBytes(targetFile)));
	
	}
}

	


