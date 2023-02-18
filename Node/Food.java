package ColoryFood;

public class Food {
	public String Kind_food;
	public double fat;
	public double cal;
	public double mineral;
	
// ctor
	public Food ( String Kind_food, double fat, double cal, double mineral ) {
		this.Kind_food = Kind_food;
		this.fat = fat;
		this.cal = cal;
		this.mineral = mineral;
	}

//out: bool => fat<10% , mineral = 100 , cal < 90
public boolean lean() {
	if(this.fat >= 10 && this.mineral != 100 && this.cal >=90)
		return false;
	else
		return true;
}

public String getKind_food() {
	return Kind_food;
}

public void setKind_food(String kind_food) {
	Kind_food = kind_food;
}

public double getFat() {
	return fat;
}

public void setFat(double fat) {
	this.fat = fat;
}

public double getCal() {
	return cal;
}

public void setCal(double cal) {
	this.cal = cal;
}

public double getMineral() {
	return mineral;
}

public void setMineral(double mineral) {
	this.mineral = mineral;
}


	
}
