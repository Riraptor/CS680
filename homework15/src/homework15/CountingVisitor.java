package homework15;
//VISITOR DESIGN PATTERN

public class CountingVisitor implements FSVisitor {
	int LinkNum = 0;
	int dirNum = 0;
	int fileNum = 0;
	
	@Override
	public void visit(Link link) {
		LinkNum++;
		
	}

	@Override
	public void visit(Directory dir) {
		dirNum++;
		
	}

	@Override
	public void visit(File file) {
		fileNum++;
		
	}
	
	public int getDirNum() {
		return dirNum;
	}
	
	public int getFileNum() {
		return fileNum;
	}
	public int getLinkNum() {
		return LinkNum;
	}

}
