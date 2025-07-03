package Basic;

public class Switch {
public static void main(String args[])
{
	char x='L';
	switch(x)
	{
	case 'L':
		System.out.println("this code contain letters");
//		break;.
	
	case 'd':
		System.out.println("this code contain digit");
		break;
	case 's':
		System.out.println("this code contain symbol");
		break;
	case 'w':
		System.out.println("contain whitespaces");
		break;
		
	default:
		System.out.println("this code doesn't contain any letter");
}
}
}