package homework12;

import static org.junit.Assert.*;


import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
public class FileSystemTest {

	@Test
	public void MakingSingleFileSystemTest() {
		FileSystem fileSystem1 = FileSystem.getFileSystem();
		FileSystem fileSystem2 = FileSystem.getFileSystem();
		
		assertThat(fileSystem1.hashCode(), is(fileSystem2.hashCode()));
	}
	
	@Test
	public void GetSingleRootTest() {
		 FileSystem fileSystem = FileSystem.getFileSystem();
		 Directory root = fileSystem.getRootDir();
		 Directory expected = root.getParent();
		 Directory actual = null;
		 assertThat(actual, is(expected));
	}


}
