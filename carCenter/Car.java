package carCenter;

public class Car {
private String name;
private int year;
private int CarNumber;
private static int CountCars;

//ctor
public Car(String name, int year, int number) {
	this.name= name;
	this.year = year;
	this.CarNumber = number;
	CountCars++;
}

// copy ctor
public Car (Car other) {
	this.name= other.name;
	this.year = other.year;
	this.CarNumber = other.CarNumber;
	CountCars++;
}

//methodology
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public int getCarNumber() {
	return CarNumber;
}

public void setCarNumber(int carNumber) {
	CarNumber = carNumber;
}

public static int getCountCars() {
	return CountCars;
}

public static void setCountCars() {
	CountCars--;
}

//@overWriting
//out: all fields
public String toString() {
	return "name: " + this.name + ", year: "  + this.year + ", number: " + this.CarNumber + "\n";	
}
}
