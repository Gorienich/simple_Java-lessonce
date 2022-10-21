package R28q2;

public class circle implements shape{
	private double r;
	private double pi;
	
	public circle(double r, double pi) {
		this.r =r;
		this.pi =pi;
		fixing();
	}

	@Override
	public double area(double r, double pi) {
		fixing();
			return Math.PI * Math.pow(r, 2);
	}

	@Override
	public double peremiter(double r, double pi) {
		fixing();
		return 2*Math.PI*r;
	}

	@Override
	public void print() {
		System.out.println("circle:");
		System.out.println("peremiter: " + (2*Math.PI*r ));
		System.out.println("area: " + (Math.PI * Math.pow(r, 2)));
	}
private void fixing() {
	if(r<= 0 || pi != 3.14) 
		System.out.println("error input");
		
	
}
}
