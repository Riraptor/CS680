package homework10;

import java.io.File;
import java.nio.file.Path;
import java.util.LinkedHashMap;

public interface CacheReplacementPolicy {


	public void replace(LinkedHashMap<Path, String> cache, Path targetFile);
}



