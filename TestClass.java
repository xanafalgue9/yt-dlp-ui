import java.util.Scanner;

public class TestClass
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print( "Enter your name >> " );
		String name = scan.nextLine();
		System.out.println( "Hello, " + name + "!" );
		
		scan.close();
		System.exit(0);
	}
}