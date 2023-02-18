package ClassWork;

public class TestRunner {
	 static public int succeeded;
	 static public int failed;

	 public TestRunner() {
	 }

	 public TestRunner(int s, int f) {
	 succeeded=s; 
	 failed=f;
	 }

	 public String toString() {
	 return succeeded + " " + failed;
	 }
}
