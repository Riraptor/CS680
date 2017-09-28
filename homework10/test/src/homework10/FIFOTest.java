package homework10;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.junit.Test;


public class FIFOTest {

	@Test
	public void FIFOFetchOneFile() throws ClassNotFoundException, IOException {
		FileCache lala = FileCache.getInstance();
		Path CachePathA = FileSystems.getDefault().getPath("src","homework10","file_root","a.html");
		String expected1 = lala.fetch(CachePathA);
		String actual1 = "STORED a.html";
		assertThat(actual1, is(expected1));
	}
	
	@Test
	public void FIFOFetchFourFiles() throws ClassNotFoundException, IOException {
		FileCache lala = FileCache.getInstance();
		Path CachePathA = FileSystems.getDefault().getPath("src","homework10","file_root","a.html");
		Path CachePathB = FileSystems.getDefault().getPath("src","homework10","file_root","b.txt");
		Path CachePathC = FileSystems.getDefault().getPath("src","homework10","file_root","c.txt");
		Path CachePathD = FileSystems.getDefault().getPath("src","homework10","file_root","d.txt");
	
		
		
		String expected2 = lala.fetch(CachePathA);
		String actual2 = "ALREADY IN CACHE a.html";
		
		String expected3 = lala.fetch(CachePathB);
		String actual3 = "STORED b.txt";
		
		String expected6 = lala.fetch(CachePathC);
		String actual6 = "STORED c.txt";
		
		String expected4 = lala.fetch(CachePathD);
		String actual4 = "FIFO REPLACEMENT FOR d.txt";
		
		
		assertThat(actual2, is(expected2));
		assertThat(actual3, is(expected3));
		assertThat(actual6, is(expected6));
		assertThat(actual4, is(expected4));
	
	}
	
	@Test
	public void FIFOFetchAlreadyCachedFile() throws ClassNotFoundException, IOException {
		FileCache lala = FileCache.getInstance();
		Path CachePathD = FileSystems.getDefault().getPath("src","homework10","file_root","d.txt");
		String expected5 = lala.fetch(CachePathD);
		String actual5 = "ALREADY IN CACHE d.txt";
		assertThat(actual5, is(expected5));
	}

}
