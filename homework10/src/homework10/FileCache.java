package homework10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;



public class FileCache {
	
	FIFO replacementPolicy;
	public int max_cache_size = 3;
	public String targetFile;
	protected LinkedHashMap<Path, String> cache = new LinkedHashMap<Path, String>();
	public String CachePath = "src/homework10/CacheFolder/";
	public String DiskPath = "src/homework10/DiskFiles/";
	static FileCache instance = null;
	
	/*
	 * 	Private because Singleton class. Other classes cannot create new FileCache.
	 */
	private FileCache() throws IOException {	

	}

	public static FileCache getInstance() throws IOException { 		
		//method used by other classes to get instance of FileCache
		if (instance == null){
			instance = new FileCache();
		}
		return instance;
	}
	

	public String fetch(Path targetFile) {
		
		try{
			// If the file is already Cashed : 
			if (cache.get(targetFile) != null) {
				
						return "ALREADY IN CACHE " + targetFile.getFileName();
			}
			// If the file is not cashed yet:
			else {			
				
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
	
		  }
	}
		

	
	private void replace(Path targetfile) {
		setCacheReplacementPolicy();
		replacementPolicy.replace( cache, targetfile); 
	}
	
	public  void setCacheReplacementPolicy() {
		replacementPolicy = FIFO.getInstance();
	}

	private void cacheFile(Path targetFile) throws IOException {
	
		cache.put(targetFile, new String(Files.readAllBytes(targetFile)));
	
	}
}

	


