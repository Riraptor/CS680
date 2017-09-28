package homework11;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.junit.Test;



public class NullReplacementByDefaultTest {

	@Test
	public void Null_replacementFetchOneFile() throws ClassNotFoundException, IOException {
		FileCache lala = FileCache.getInstance();
		Path CachePathA = FileSystems.getDefault().getPath("src","homework11","file_root","a.html");
		String expected1 = lala.fetch(CachePathA);
		String actual1 = "STORED a.html";
		assertThat(actual1, is(expected1));
	}
	
	@Test
	public void Null_replacementFetchFourFiles() throws ClassNotFoundException, IOException {
		FileCache lala = FileCache.getInstance();
		
		Path CachePathB = FileSystems.getDefault().getPath("src","homework11","file_root","b.txt");
		Path CachePathC = FileSystems.getDefault().getPath("src","homework11","file_root","c.txt");
		Path CachePathD = FileSystems.getDefault().getPath("src","homework11","file_root","d.txt");
		Path CachePathE = FileSystems.getDefault().getPath("src","homework11","file_root","e.html");
		

		
		String expected3 = lala.fetch(CachePathB);
		String actual3 = "STORED b.txt";
		
		String expected6 = lala.fetch(CachePathC);
		String actual6 = "STORED c.txt";
		
		String expected4 = lala.fetch(CachePathD);
		String actual4 = "NULL REPLACEMENT POLICY d.txt";
		
		String expected5 = lala.fetch(CachePathE);
		String actual5 = "NULL REPLACEMENT POLICY e.html";
		
	
		assertThat(actual3, is(expected3));
		assertThat(actual6, is(expected6));
		assertThat(actual4, is(expected4));
		assertThat(actual5, is(expected5));
	}


	
}
