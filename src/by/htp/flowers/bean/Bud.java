package by.htp.flowers.bean;

public class Bud {
	
	private static final String DEFAULT_BUD_COLOR = "green";
	private static final int DEFAULT_BUD_SIZE = 1;
	
	private String color;
	private int size;
	private Leaf[] leaves;
	
	Bud() {
		color = DEFAULT_BUD_COLOR;
		size = DEFAULT_BUD_SIZE;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Leaf[] getLeaves() {
		return leaves;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	void addFreshLeaves(int leafNumber, String leafColor, String leafShape) {
		
		if (leaves == null) {
			leaves = new Leaf[leafNumber];
			for(int i = 0; i < leafNumber; i++) {
				leaves[i] = new Leaf(leafColor, leafShape);
			}
		}
		
	}
	
	void removeLeaves(int leafNumber, String leafColor, String leafShape) {
		
		if (leaves != null) {
			leaves = new Leaf[leafNumber];
			for(int i = 0; i < leafNumber; i++) {
				leaves[i] = new Leaf(leafColor, leafShape);
			}
		}
		
	}
	
}
