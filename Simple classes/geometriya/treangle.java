package R28q2;

public class triangle implements shape {
	private double length;
	private double width;
	
	public triangle(double length, double width) {
		this.length = length;
		this.width = width;
		fixing();
	}

	@Override
	public double area(double length, double width) {
		fixing();
		return 2 / (length * width);
	}

	@Override
	public double peremiter(double length, double width) {
		fixing();
		return length + width + (Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2)));
	}

	@Override
	public void print() {
	 System.out.println("triangle:");
		System.out.println("peremiter: " + (length + width + (Math.sqrt((Math.pow(length, 2) + Math.pow(width, 2))))));
		System.out.println("area: " + ( (length * width) /2 ));
	}

	private void fixing() {
		if (length <= 0 || width <= 0)
			System.out.println("error input");
	}

}
