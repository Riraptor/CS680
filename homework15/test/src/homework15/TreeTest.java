package homework15;

import static org.junit.Assert.*;

import java.util.Date;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class TreeTest {

	@Test
	public void getSizeTest() {
		Date d1 = new Date();
		Date m1 = new Date();
		
	    FileSystem fileSystem = FileSystem.getFileSystem();
	    Directory root = fileSystem.getRootDir();
		Directory system = fileSystem.MakeDir(root, "System", "user", d1, m1);
		Directory home = fileSystem.MakeDir(root, "Home", "user", d1, m1);
		File a = fileSystem.MakeFile(system, "a", "user", d1, m1, 20);
		File b = fileSystem.MakeFile(system, "b", "user", d1, m1, 20);
		File c = fileSystem.MakeFile(system, "c", "user", d1, m1, 20);
		File d = fileSystem.MakeFile(home, "d", "user", d1, m1, 20);
		Directory picture = fileSystem.MakeDir(home, "Picture", "user", d1, m1);
		File e = fileSystem.MakeFile(picture, "e", "user", d1, m1, 20);
		File f = fileSystem.MakeFile(picture, "f", "user", d1, m1, 20);
		Link x = fileSystem.MakeLink(home,"x","user",system);
		Link y = fileSystem.MakeLink(picture, "y", "user", e);
		fileSystem.AddChild(picture,y);
		fileSystem.AddChild(home,x);
		fileSystem.AddChild(root, system);
		fileSystem.AddChild(root, home);
		fileSystem.AddChild(system, a);
		fileSystem.AddChild(system, b);
		fileSystem.AddChild(system, c);
		fileSystem.AddChild(home, d);
		fileSystem.AddChild(home, picture);
		fileSystem.AddChild(picture, e);
		fileSystem.AddChild(picture, f);
		
		int actual = 120;
		int expected = fileSystem.GetTotalSizeOfDir(root);
		assertThat(actual, is(expected));
		
		
	}
	@Test
	public void PrillAllElements() {
		FileSystem fileSystem = FileSystem.getFileSystem();
		fileSystem.showAllElements();
	}

}
