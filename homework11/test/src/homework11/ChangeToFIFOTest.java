package homework11;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.junit.Test;

public class ChangeToFIFOTest {

	@Test
	public void phangeToFIFOfetchOneFile() throws ClassNotFoundException, IOException {
		FileCache lala = FileCache.getInstance();
		Path CachePathB = FileSystems.getDefault().getPath("src","homework11","file_root","b.txt");
		Path CachePathC = FileSystems.getDefault().getPath("src","homework11","file_root","c.txt");
		Path CachePathD = FileSystems.getDefault().getPath("src","homework11","file_root","d.txt");
		Path CachePathE = FileSystems.getDefault().getPath("src","homework11","file_root","e.html");
		 lala.fetch(CachePathB);
		 lala.fetch(CachePathC);
		 lala.fetch(CachePathD);
		 lala.fetch(CachePathE);
		lala.setCacheReplacementPolicy();
		Path CachePathA = FileSystems.getDefault().getPath("src","homework11","file_root","a.html");
		String expected1 = lala.fetch(CachePathA);
		String actual1 = "FIFO REPLACEMENT FOR a.html";
		assertThat(actual1, is(expected1));
	}
}
