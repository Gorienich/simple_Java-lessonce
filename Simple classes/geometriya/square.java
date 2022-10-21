package R28q2;

public class square implements shape {
 private double length;
 private double width;
 
 public square(double length,double width) {
	 this.length =length;
	 this.width =width;
	 fixing();
 }

@Override
public double area(double length, double width) {
	fixing();
	return 2*length;
}

@Override
public double peremiter(double length, double width) {
	fixing();
	return 4*length;
}

@Override
public void print() {
	System.out.println("squere:");
	System.out.println("peremiter: " + (4*length));
System.out.println("area: " + (2*length));
}
 private void fixing() {
	 if(length <=0 || width<= 0)
		 System.out.println("error input");
 }
}
