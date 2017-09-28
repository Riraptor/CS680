package homework11;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.junit.Test;

public class FileNotFoundTest {

	@Test(expected = FetchNotFoundException.class)
	public void FileNotFound() throws IOException {
		FileCache lala = FileCache.getInstance(); 

		Path CachePathT = FileSystems.getDefault().getPath("src","homework10","file_root","t.txt");
		lala.fetch(CachePathT);
	}

}
