package homework11;

import java.io.File;
import java.nio.file.Path;
import java.util.LinkedHashMap;

public class NullReplacement implements CacheReplacementPolicy{

	@Override
	public void replace(LinkedHashMap<Path, String> cache, Path targetFile) {
	
		
	}
	public String message() {
		return("NULL REPLACEMENT POLICY ");
	}

}
