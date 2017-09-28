package homework15;
//VISITOR DESIGN PATTERN

public class Link extends FSElement{

	private FSElement target;
	String name;
	public Link(Directory parent, String name, String owner, FSElement target){
		this.target = target;
		this.name = name;
	}
	
	public int getSize(){
		return 0;
	}
	
	public int getTargetSize(){
		return target.getSize();
	}
	
	public boolean isFile(){
		return true;
	}
	public String getName(){
		return this.name + " (Link)";
	}
	public void accept(FSVisitor v) {
		v.visit(this);
	}

	public int getDiskUtil() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
