package carCenter;
/*
 * max count of cars in car center => 200 cars
 * 
 * methodology:
 * toString() => show all cars in car center
 * addCar() => collect car to array of car center
 * assertCar() => delete car from array by knowing car number, correct array and replace null space to end of array
 * carStatus() => show number of created cars in car center and empty places in array
 */
public class All_Cars {
 private Car [] arr;
 private int lastposition;
 
 //ctor
 public All_Cars(Car [] array) { // possible  to get less length of array
	 this.arr = new Car[20];  // check length
	 lastposition =0;
	 for(int i=0; i<array.length; i++)
		 this.arr[lastposition++] = array[i];
 }
 
 //@overwriting
 // out: all cars in car center
 public String toString() {
	 String st = "";
	 for(int i=0; i< this.arr.length; i++)
		 if(this.arr[i] != null)
			 st += this.arr[i].toString();
	 return st;
 }
 
 //add car
 // in: new car
 // func: collect car to array in car center
 public void addCar(Car other) {
	 if(lastposition < this.arr.length)
		 this.arr[lastposition++] = other;
	 else
		 System.out.println("car center is full");	 
 }
 
 //remove car from car center
 //in: number of car
 //func: delete car from array
 public void remCar(int number) {
	 boolean flag = false;
	 
	 // find a car by car number
	 for(int i=0; i<this.arr.length; i++)
		 if(this.arr[i] != null && number == this.arr[i].getCarNumber())
		 {
			 this.arr[i] = null;
			 flag = true;
			 nullClear();  // callback to fix array (private function)
		 }
	 if(!flag)
		 System.out.println("didn't found such car");
	 
 }
 
 //helper to remove null to the end of array 
 private void nullClear() {
	 Car temp = null;
	 boolean flag = true;
	 
	 for(int i=0; i<this.arr.length; i++)
	 {
		 // find null
		 if(arr[i] == null)
		 {
			 //search for the object 
			 for(int j=i+1; j<this.arr.length && flag; j++)
			 {
				 if(arr[j] != null && arr[j] != temp)
				 {
					 arr[i] = arr[j];
					 temp = arr[j];
					 flag = false;	// stop checking				 
				 }
			 }
		 }
	 }
	 	// correct array place after remove car and counter of class Car
	 	lastposition--; 
		Car.setCountCars();
 }
 
 public Car[] getArr() {
	return arr;
}

//car center status
 //out: amounted of created cars and amounted of free space in car center
 public void carStatus() {
		 System.out.println("car center has: " + (lastposition)  +
				            ", empty space for: " + (this.arr.length-lastposition) + " car");	 
 }
}
