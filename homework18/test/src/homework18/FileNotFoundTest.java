package homework18;



import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.junit.Test;

public class FileNotFoundTest {

	@Test(expected = FileNotFoundException.class)
	public void FileNotFound() throws IOException {
		FIFOFileCache lala = FIFOFileCache.getInstance(); 

		Path CachePathT = FileSystems.getDefault().getPath("src","homework18","file_root","t.txt");
		lala.fetch(CachePathT);
	}

}
