package homework15;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class SizeCountingVisitorTest {


	@Test
	public void TotalSize_180_Test() {
		Date d1 = new Date();
		Date m1 = new Date();
		
	   
		FileSystem fileSystem = FileSystem.getFileSystem();
		Directory root = fileSystem.getRootDir();
	
		Directory system = fileSystem.MakeDir(root, "System", "user", d1, m1);
		Directory home = fileSystem.MakeDir(root, "Home", "user", d1, m1);
		File a = fileSystem.MakeFile(system, "a.txt", "user", d1, m1, 30);
		File b = fileSystem.MakeFile(system, "b.txt", "user", d1, m1, 30);
		File c = fileSystem.MakeFile(system, "c.txt", "user", d1, m1, 30);
		File d = fileSystem.MakeFile(home, "d", "user", d1, m1, 30);
		Directory pictures = fileSystem.MakeDir(home, "Picture", "user", d1, m1);
		File e = fileSystem.MakeFile(pictures, "e", "user", d1, m1, 30);
		File f = fileSystem.MakeFile(pictures, "f", "user", d1, m1, 30);
		Link x = fileSystem.MakeLink(home,"x","user",system);
		Link y = fileSystem.MakeLink(pictures, "y", "user", e);
		fileSystem.AddChild(pictures,y);
		fileSystem.AddChild(home,x);
		fileSystem.AddChild(root, system);
		fileSystem.AddChild(root, home);
		fileSystem.AddChild(system, a);
		fileSystem.AddChild(system, b);
		fileSystem.AddChild(system, c);
		fileSystem.AddChild(home, d);
		fileSystem.AddChild(home, pictures);
		fileSystem.AddChild(pictures, e);
		fileSystem.AddChild(pictures, f);
		
		SizeCountingVisitor visitor = new SizeCountingVisitor();
		root.accept(visitor);
		
		int actual = 180;
		int expected = visitor.getTotalSize();
		assertThat(actual, is(expected));
		
	}
}
