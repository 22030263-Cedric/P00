
public class Calculator {
	public int add (int a, int b) {
		 return a + b;
	}
	
	public int subtract (int a, int b) {
		 return a - b;
	}
	public int multiple(int a , int b) {
		return a * b;
	}
	public int divide(int a , int b) {
		return a/b;
	}
	//Divide by 0, ErrorCondition
	public Integer divideifError(int a , int b) {
		if(b==0) {
		return null;
		}
		else {
			return b/a;
		}
	}
}
