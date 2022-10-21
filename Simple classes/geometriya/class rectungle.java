package R28q2;


public class rectangle implements shape {
 private double length;
 private double width;
 
 public rectangle(double length,double width) {
	 this.length =length;
	 this.width =width;
	 fixing();
 }

@Override
public double area(double length, double width) {
	fixing();
	return width*length;
}

@Override
public double peremiter(double length, double width) {
	fixing();
	return (length +width)*2;
}

@Override
public void print() {
	System.out.println("RECTANGLE\n peremiter: " + (width*length));
System.out.println("area: " + ((length +width)*2));
}
 private void fixing() {
	 if(length <=0 || width<= 0)
		 System.out.println("error input");
 }
}


