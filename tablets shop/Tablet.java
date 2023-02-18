package examTraining1;

public class Tablet {
	private String name;
	private String kind;
	private char system;
	private double size;
	private double price;
//ctor	
	public Tablet(String name, String kind, char system,
				  double size,double price) 
	{
		this.name = name;
		this.kind = kind;
		this.system = system;
		this.size = size;
		this.price = price;
	}
	
//overloading copy ctor
	public Tablet (Tablet other)
	{
		this.name = other.name;
		this.kind = other.kind;
		this.system = other.system;
		this.size = other.size;
		this.price = other.price;
	}
//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public char getSystem() {
		return system;
	}

	public void setSystem(char system) {
		this.system = system;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
// same tablet	
	public boolean isSame(Tablet other) {
		if(other.getName().equals(this.name) && 
		   other.getKind().equals(this.kind) &&
		   other.getSize() == this.size)
			return true;
		
		return false;
	}
//Overriding
	public String toString() {
		return "name: " + this.name + "\n" +
				"kind: " + this.kind + "\n" +
				"size: " + this.size + "\n" +
				"system: " + this.system + "\n" + 
				"price: " + this.price + "\n";
	} 
}
