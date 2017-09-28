package homework15;
//VISITOR DESIGN PATTERN

import java.util.ArrayList;

public class FileSearchVisitor implements FSVisitor {

	String extension;
	ArrayList<File> foundFiles= new ArrayList<File>();
	
	public FileSearchVisitor(String key) {
		extension = key;
	}
 	@Override
	public void visit(Link link) {
	return;
		
	}

	@Override
	public void visit(Directory dir) {
		return;
	}

	@Override
	public void visit(File file) {
		if(file.getName().contains(extension)) {
			foundFiles.add(file);
		}
	}
	public ArrayList<File> getFoundFiles() {
		return foundFiles;
		
	}

}
