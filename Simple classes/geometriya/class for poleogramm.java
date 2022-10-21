package R28q2;

public class polleogram implements shape{
	private double length;
	private double width;
	
	public polleogram(double length,double width) {
		this.length = length;
		this.width = width;
		fixing();
	}

	@Override
	public double area(double length, double width) {
		fixing();
		return length * width;
	}

	@Override
	public double peremiter(double length, double width) {
		fixing();
		return (length + width)*2;
	}

	@Override
	public void print() {
		System.out.println("parallelogram:");
		System.out.println("peremiter: " + ((length + width)*2));
		System.out.println("area: " + (length*width));
	}
private void fixing() {
	if(length <= 0 || width <= 0)
		System.out.println("error input");
}
}
