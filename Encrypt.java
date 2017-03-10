import java.util.Scanner;
public class Encrypt {
	static Scanner scan = new Scanner(System.in);
	public static void main( String[] args )
	{
		int T = scan.nextInt();
		for( int i = 0; i < T; i++ )
		{
			String input = scan.next();
			
			for( int j = 0; j < input.length(); j += 2 )
				System.out.print(input.charAt(j));
			for( int j = 1; j < input.length(); j += 2)
				System.out.print(input.charAt(j));
			System.out.println();
		}
	}
}
