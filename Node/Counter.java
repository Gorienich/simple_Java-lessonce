package ClassWork;

public class Counter {
  private static int count;
  
  public Counter() {
	  count++;
  }
  // must be static 
  public static int getCount() {
	  return count;
  }
}
