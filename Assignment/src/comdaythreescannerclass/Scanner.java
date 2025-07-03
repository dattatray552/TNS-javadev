package comdaythreescannerclass;

public class Scanner {
	int m=12;
	//non-parametrized method
	public void addition()
	{
		int x=3;//local variable
		int y=8;
		int add =x+y;
		System.out.println("addition is x and y= " +add);
		System.out.println(m);
	}
	///parametrized method
	public void multiply(int a,int b)
	{
		int mul=a*b;
		System.out.println("multiplication of a and b="+mul);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj1= new Scanner();
		obj1.addition();
		obj1.multiply(4,6);

	}

}
