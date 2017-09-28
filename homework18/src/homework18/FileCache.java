package homework18;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;



public abstract class FileCache {
	
	public int max_cache_size = 3;
	public String targetFile;
	protected LinkedHashMap<Path, String> cache = new LinkedHashMap<Path, String>();
	public String CachePath = "src/homework18/CacheFolder/";
	public String DiskPath = "src/homework18/DiskFiles/";
	static FileCache instance = null;

	/*
	 * 	Private because Singleton class. Other classes cannot create new FileCache.
	 */
	public FileCache() throws IOException {	

	}

	

	public String fetch(Path targetFile) {
		
		try{
			/*
			 * If the file is already Cashed : 
			 */
			if (cache.get(targetFile) != null) {
						return "ALREADY IN CACHE " + targetFile.getFileName();
			}
			/*
			 * If the file is not cashed yet:
			 */
			else {			
					
			/*
			 *  If cache size is not full
		     */
				if (cache.size() < max_cache_size) {		
					cacheFile(targetFile);
						return "STORED " + targetFile.getFileName();
					}
						// If cache size is full
					else{
						replace(targetFile); 
						return  "REPLACED BY " + targetFile.getFileName();
					}
			}
		} catch (Exception e) {
			throw new FileNotFoundException();
		} finally {
			 for (Map.Entry<Path, String> entry : cache.entrySet()){
			  		System.out.println(" Hash Values------ "+entry.getValue());
			 }
	
		  }
	}
		


	private void cacheFile(Path targetFile) throws IOException {
	
		cache.put(targetFile, new String(Files.readAllBytes(targetFile)));
	
	}



	protected abstract void replace(Path targetFile);

}

	


