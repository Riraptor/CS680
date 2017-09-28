package homework18;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;




public class FIFOFileCache extends FileCache {
	static FIFOFileCache instance = null;
	private FIFOFileCache() throws IOException {
		super();
	}
	
	public static FIFOFileCache getInstance() throws IOException {
		if (instance == null){
			instance = new FIFOFileCache();
	}
	return instance;
	}
	@Override
	protected  void replace(Path targetFile) {
		cache.remove(cache.entrySet().iterator().next().getKey());
		try {
			cache.put(targetFile, new String(Files.readAllBytes(targetFile)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
