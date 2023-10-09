package JavaPart;

public class arithematic {
	// (((((10+2)+2)-2)*2)/2)	
	public int addition(int a,int b) {
		int c;
		c=a+b;
		System.out.println("Result of addition is " +c);
		return c;
	}
	public int subtract(int a, int b) {
		int c;
		c=a-b;
		System.out.println("Result of Subtraction is "  +c);
		return c;
	}
	public int multiplication(int a, int b) {
		int c;
		c=a*b;
		System.out.println("Result of Multiplication is "  +c);
		return c;
	}
	public int division(int a, int b) {
		int c;
		c=a/b;
		return c; 
	}
	public static void main(String[] args) {
		arithematic obj= new arithematic();
		
		int add=obj.addition(10, 2);
		int add_Again=obj.addition(add, 2);
		int sub = obj.subtract(add_Again, 2);
		int mul= obj.multiplication(sub, 2);
		System.out.println("Result of Division is " + obj.division(mul, 2));
		
		
	}

}
