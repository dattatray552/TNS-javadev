package Basic;
import java.util.Scanner;

public class Prime {
	public static void main(String args[])
	{
		Scanner Input=new Scanner(System.in);
		System.out.println("enter a number");
		int num = Input.nextInt();
		if(num%2!=0) {
			System.out.println(num + "is prime");
		}
		else {
			System.out.println(num + "is not prime");
		}
		Input.close();
	}

}
