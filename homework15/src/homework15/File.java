package homework15;
//VISITOR DESIGN PATTERN

import java.util.Date;

public class File extends FSElement{
	private String name;
	private String owner;
	private Date created;
	private Date lastModified;
	private int size;
	public File(Directory parent, String name, String owner, Date created, Date lastModified, int size) {
		this.name = name;
		this.owner = owner;
		this.created = created;
		this.lastModified = lastModified;
		this.size = size;
	}

	public int getSize(){
		return this.size;
	}
	public String getName(){
		return this.name;
	}
	public void accept(FSVisitor v) {
		v.visit(this);
	}

	public int getDiskUtil() {
		// TODO Auto-generated method stub
		return this.getSize();
	}

}
